package net.ahzz.share.jpa.query;

import net.ahzz.share.jpa.entities.Student;
import net.ahzz.share.sharejpa.bean.Page;
import net.ahzz.share.sharejpa.query.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Query;
import java.util.List;

/**
 * meimei
 * 2019/12/9
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class ConditionTest {
    protected static Log log = LogFactory.getLog(ConditionTest.class);


    @Test
    public void testGroupByMulti(){
        Condition condition = Condition.getInstance(Student.class);
        condition.add(SelectExpr.count("sex"));
        condition.add(SelectExpr.avg("age"));
        condition.add(Group.values("status,classes"));
        Query query = condition.getQuery();
        Assert.assertNotNull(query);
    }

    @Test
    public void testGroupBy(){
        Condition condition = Condition.getInstance(Student.class);
        condition.add(SelectExpr.count("sex"));
        condition.add(Group.values("status"));
        Query query = condition.getQuery();
        Assert.assertNotNull(query);
    }

    public void testOrderByMulti(){
        Condition condition = Condition.getInstance(Student.class);
        condition.add(Order.createMulti("orderNum asc,status desc"));
    }

    public void testOrderBy1(){
        Condition condition = Condition.getInstance(Student.class);
        condition.add(Order.create("orderNum","asc"));
    }

    public void testOrderBy(){
        Condition condition = Condition.getInstance(Student.class);
        condition.add(Order.create("orderNum"));
    }

    public void testPage(){
        Condition condition = Condition.getInstance(Student.class);
        condition.add(Expr.isNotNull("status"));
        Page page = new Page();
        page.pages=1;
        page.pageSize=10;
        condition.add(page);
    }

    @Test
    public void testExpr(){
        Condition condition = Condition.getInstance(Student.class);
        String[] statuss = new String[]{"1","2"};
        condition.add(Expr.eq("sex","1"));
        condition.add(Expr.like("name","张"));
        condition.add(Expr.create("age",20,Expr.OPT_GE));
        condition.add(Expr.in("status",statuss));
        condition.add(Expr.isNotNull("classes"));
        Query query = condition.getQuery();
        List<Student> list = query.getResultList();
        Assert.assertNotNull(list);
    }


    /**
     * 测试left join
     */
    public void testJoinObject(){
        Condition condition = Condition.getInstance(Student.class);
        condition.alias("a");
        JoinObject joinObject = JoinObject.create("classes").alias("b").target("a");
        condition.add(joinObject);
        condition.add(Expr.like("a.name","张"));
        condition.add(Expr.eq("b.id",1));
        Query query = condition.getQuery();
        List<Student> list = query.getResultList();
        log.info("sql "+list.size());

    }


    @Test
    public void testSelectExpr(){
        Condition condition = Condition.getInstance(Student.class);
        condition.add(SelectExpr.count("id"));
        condition.add(SelectExpr.max("orderNum"));
        Query query = condition.getQuery();
        Object[] objs = ( Object[])query.getSingleResult();
        System.out.println("list.0" +objs[0]);
        System.out.println("list.1" +objs[1]);

    }

    @Test
    public void testIsNull(){
        Condition condition = Condition.getInstance(Student.class);
        condition.add(Expr.isNotNull("icon"));
        Query query = condition.getQuery();
        List<Student> list = query.getResultList();
        log.info("sql "+list.size());
    }
}

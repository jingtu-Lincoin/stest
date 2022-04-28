package net.ahzz.share.jpa.service;

import net.ahzz.share.jpa.entities.Grade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * meimei
 * 2022-04-27
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class GradeServiceTest {

    @Autowired
    GradeService gradeService;


    @Test
    public void testAdd(){
        Grade grade = new Grade();
        grade.name="2年级";
        grade.code="g2";
        gradeService.save(grade);
        Assert.assertNotNull(grade);
    }

}

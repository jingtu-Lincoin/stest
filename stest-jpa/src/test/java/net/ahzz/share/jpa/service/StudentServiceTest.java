package net.ahzz.share.jpa.service;

import net.ahzz.share.jpa.entities.Classes;
import net.ahzz.share.jpa.entities.Student;
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
public class StudentServiceTest {

    @Autowired
    StudentService studentService;

    @Test
    public void testAdd(){
        Student student = new Student();
        student.age=9;
        student.classes = new Classes(Long.valueOf(2));
        student.code="s7";
        student.name="孙电夺";
        student.orderNum=1;
        student.status="1";
        student.sex="1";
        studentService.save(student);
        Assert.assertNotNull(student);
    }

}

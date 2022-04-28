package net.ahzz.share.jpa.service;

import net.ahzz.share.jpa.entities.Classes;
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
public class ClassesServiceTest {

    @Autowired
    ClassesService classesService;

    @Test
    public void testAdd(){
        Classes classes = new Classes();
        classes.name="2-1班";
        classes.code="2_1";
        classes.gradeId=Long.valueOf(2);
        classes.gradeName="2年级";
        classesService.save(classes);
        Assert.assertNotNull(classes);
    }

}

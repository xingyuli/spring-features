package org.swordess.toy.spring.annotationbased.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:resource-annotation.xml")
public class DemonstrateResourceAnnotation {

    @Resource
    private ResourceAnnotationOnFieldAndSetter usingResourceOnFieldAndSetter;

    @Test
    public void demonstrateResourceAnnotationOnField() {
        assertEquals("Why am I magic?", usingResourceOnFieldAndSetter.getBehavior());
    }

    @Test
    public void demonstrateResourceAnnotationOnSetter() {
        assertTrue(3600 == usingResourceOnFieldAndSetter.getDuration());
    }

}

package org.swordess.toy.spring.annotationbased.required;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:required-annotation.xml")
public class DemonstrateRequiredAnnotation {

    @Autowired
    private RequiredAnnotationOnSetterMethod usingRequired;

    @Test
    public void demonstrateRequiredAnnotaionOnSetterMethod() {
        assertEquals("I'm the Magic String!", usingRequired.getMagicString());
    }

}

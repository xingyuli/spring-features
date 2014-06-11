package org.swordess.toy.spring.beaninheritance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class DemonstrateBeanDefinitionInheritance {

    @Autowired
    private Tutorial tutorial;

    @Test
    public void demonstrateBeanDefinitionInheritance() {
        assertEquals("Tutorial", tutorial.getPackageName());
        assertEquals("1.0.0", tutorial.getVersion());
        assertEquals("20200101", tutorial.getReleaseDate());
    }

}

package org.swordess.toy.spring.cpscanning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class DemonstrateComponentScan {

    @Autowired
    private ApplicationContext appContext;

    @Test
    public void beanCanBeFoundWhenComponentScan() {
        assertTrue(appContext.containsBean("movieFinder"));
        assertTrue(appContext.containsBean("simpleMovieLister"));
    }

}

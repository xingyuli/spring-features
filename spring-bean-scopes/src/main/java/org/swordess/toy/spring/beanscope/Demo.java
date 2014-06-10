package org.swordess.toy.spring.beanscope;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertSame;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class Demo {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void demonstrateSingletonScope() {
        Integer limit1 = (Integer) applicationContext.getBean("limit");
        Integer limit2 = (Integer) applicationContext.getBean("limit");
        assertSame(limit1, limit2);
    }

    @Test
    public void demonstratePrototypeScope() {
        Boolean fantasy1 = (Boolean) applicationContext.getBean("fantasy");
        Boolean fantasy2 = (Boolean) applicationContext.getBean("fantasy");
        assertEquals(fantasy1, fantasy2);
        assertNotSame(fantasy1, fantasy2);
    }

    @Test
    public void demonstrateInjectPrototypeScopedBeanIntoAnotherBean() {
        Data data1 = (Data) applicationContext.getBean("data1");
        Data data2 = (Data) applicationContext.getBean("data2");
        assertEquals(data1.isObsolete(), data2.isObsolete());
        assertNotSame(data1.isObsolete(), data2.isObsolete());
    }

}

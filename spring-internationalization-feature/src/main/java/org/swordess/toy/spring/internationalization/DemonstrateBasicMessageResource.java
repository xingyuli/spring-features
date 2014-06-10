package org.swordess.toy.spring.internationalization;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:message-resource-basic.xml")
public class DemonstrateBasicMessageResource {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void demonstrateResourceBundleMessageSource() {
        Example example = (Example) applicationContext.getBean("example");
        example.execute();
    }

}

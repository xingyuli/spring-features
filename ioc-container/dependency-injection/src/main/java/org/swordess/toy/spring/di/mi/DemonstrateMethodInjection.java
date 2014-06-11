package org.swordess.toy.spring.di.mi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertFalse;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:method-injection.xml")
public class DemonstrateMethodInjection {

    @Autowired
    private CommandManager commandManager;

    @Test
    public void demonstrateLookupMethodInjection() {
        Object result1 = commandManager.process(new Object());
        Object result2 = commandManager.process(new Object());
        assertFalse(result1.toString().equals(result2.toString()));
    }

}

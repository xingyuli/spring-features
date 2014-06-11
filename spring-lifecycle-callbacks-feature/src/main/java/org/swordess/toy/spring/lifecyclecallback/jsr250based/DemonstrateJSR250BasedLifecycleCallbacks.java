package org.swordess.toy.spring.lifecyclecallback.jsr250based;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:jsr250-based-callbacks.xml")
public class DemonstrateJSR250BasedLifecycleCallbacks {

    @Test
    public void demonstrateJSR250BasedInitializationCallbackAndDestructionCallback() {
        /* placeholder for providing a test method */
    }

}

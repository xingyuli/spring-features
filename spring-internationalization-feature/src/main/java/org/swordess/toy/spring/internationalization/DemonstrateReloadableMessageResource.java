package org.swordess.toy.spring.internationalization;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Locale;
import java.util.concurrent.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:message-resource-reloadable.xml")
public class DemonstrateReloadableMessageResource {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void demonstrateReloadableResourceBundleMessageSource() throws ExecutionException, InterruptedException {
        String lastVersion = null;
        boolean propertyChangeDetected = false;
        while (!propertyChangeDetected) {
            String version = applicationContext.getMessage("version", null, Locale.getDefault());
            System.out.println(version);

            propertyChangeDetected = (null != lastVersion) && !version.equals(lastVersion);
            if (!propertyChangeDetected) {
                lastVersion = version;
                TimeUnit.SECONDS.sleep(5);
            }
        }
    }

}

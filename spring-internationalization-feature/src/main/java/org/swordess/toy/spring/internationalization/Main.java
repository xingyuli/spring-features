package org.swordess.toy.spring.internationalization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    private static ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");

    public static void main(String[] args) {
        if (isDemonstrateBasicResourceEnabled()) {
            demonstrateBasicResource();
        }

        if (isDemonstrateReloadableResourceEnabled()) {
            demonstrateReloadableResource();
        }
    }

    private static void demonstrateBasicResource() {
        Example example = (Example) appContext.getBean("example");
        example.execute();
    }

    private static void demonstrateReloadableResource() {
        final ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new Runnable() {
            @Override
            public void run() {
                String lastVersion = null;
                boolean propertyChangeDetected = false;
                while (!propertyChangeDetected) {
                    try {
                        TimeUnit.SECONDS.sleep(5);
                        String version = appContext.getMessage("version", null, Locale.getDefault());
                        System.out.println(version);

                        propertyChangeDetected = (null != lastVersion) && !version.equals(lastVersion);
                        lastVersion = version;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                executor.shutdown();
            }
        });
    }

    private static boolean isDemonstrateBasicResourceEnabled() {
        if (!appContext.containsBean("demonstrateBasicResource")) {
            return false;
        }
        return (Boolean)appContext.getBean("demonstrateBasicResource");
    }

    private static boolean isDemonstrateReloadableResourceEnabled() {
        if (!appContext.containsBean("demonstrateReloadableResource")) {
            return false;
        }
        return (Boolean)appContext.getBean("demonstrateReloadableResource");
    }

}

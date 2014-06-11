package org.swordess.toy.spring.lifecyclecallback;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoShutdownTheSpringIOCContainerGracefullyInNonWebApplications {

    public static void main(String[] args) {
        AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("xml-based-callbacks.xml");
        appContext.registerShutdownHook();

        System.out.println("application is running...");
    }

}

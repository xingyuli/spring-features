package org.swordess.toy.spring.internationalization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        Example example = (Example) appContext.getBean("example");
        example.execute();
    }

}

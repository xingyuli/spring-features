package org.swordess.toy.spring.message_source;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class Demo {

    public static void main(String[] args) {
        MessageSource resources = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(resources.getMessage("message", null, Locale.ENGLISH));
        System.out.println(resources.getMessage("message", null, Locale.CHINESE));
    }

}

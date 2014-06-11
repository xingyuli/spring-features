package org.swordess.toy.spring.lifecyclecallback.xmlbased;

public class Accessor {

    public void init() {
        System.out.println("accessor initiated");
    }

    public void destroy() {
        System.out.println("accessor destroyed");
    }

}

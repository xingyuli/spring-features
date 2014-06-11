package org.swordess.toy.spring.lifecyclecallback.jsr250based;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Accessor {

    @PostConstruct
    public void init() {
        System.out.println("accessor initiated");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("accessor destroyed");
    }

}

package org.swordess.toy.spring.di.mi;

import java.util.concurrent.atomic.AtomicInteger;

public class Command {

    private static final AtomicInteger ID = new AtomicInteger();

    private Object state;

    public void setState(Object commandState) {
        this.state = commandState;
    }

    public Object execute() {
        return "Done" + ID.incrementAndGet();
    }

}

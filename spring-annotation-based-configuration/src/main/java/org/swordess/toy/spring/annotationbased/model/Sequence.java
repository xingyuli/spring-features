package org.swordess.toy.spring.annotationbased.model;

import org.springframework.core.Ordered;

public class Sequence implements Ordered {

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int getOrder() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

}

package org.swordess.toy.spring.annotationbased.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * You can also apply the annotation to methods with arbitrary names and/or
 * multiple arguments.
 */
public class AutowiredAnnotationOnArbitraryMethod {

    private Integer magicNumber;

    @Autowired
    public void prepare(Integer magicNumber) {
        this.magicNumber = magicNumber;
    }

    public Integer getMagicNumber() {
        return magicNumber;
    }

}

package org.swordess.toy.spring.annotationbased.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * You can apply @Autowired to constructors.
 */
public class AutowiredAnnotationOnConstructor {

    private String magicConstructorArg;

    @Autowired
    public AutowiredAnnotationOnConstructor(String magicConstructorArg) {
        this.magicConstructorArg = magicConstructorArg;
    }

    public String getMagicConstructorArg() {
        return magicConstructorArg;
    }

}

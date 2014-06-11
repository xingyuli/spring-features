package org.swordess.toy.spring.annotationbased.autowired;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * You can apply the @Autowired annotation to traditional setter methods.
 */
public class AutowiredAnnotationOnSetterMethod {

    private String magicString;

    @Autowired
    public void setMagicString(String magicString) {
        this.magicString = magicString;
    }

    public String getMagicString() {
        return magicString;
    }

}

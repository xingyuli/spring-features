package org.swordess.toy.spring.annotationbased.required;

import org.springframework.beans.factory.annotation.Required;

/**
 * The @Required annotation applies to bean property setter methods.
 * This annotation simply indicates that the affected property must be
 * populated at configuration time, through an explicitly property value
 * in a bean definition or through autowiring.
 * <p/>
 * The container throws an exception if the affected bean property has not
 * been populated; this allows for eager and explicit failure, avoiding
 * NullPointerExceptions or the like later on.
 */
public class RequiredAnnotationOnSetterMethod {

    private String magicString;

    @Required
    public void setMagicString(String magicString) {
        this.magicString = magicString;
    }

    public String getMagicString() {
        return magicString;
    }

}

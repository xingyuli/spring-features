package org.swordess.toy.spring.annotationbased.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.swordess.toy.spring.annotationbased.model.Vehicle;

public class QualifierAnnotationOnArgument {

    private Vehicle crashed;

    @Autowired
    public void prepare(@Qualifier("crashed") Vehicle crashed) {
        this.crashed = crashed;
    }

    public Vehicle getCrashed() {
        return crashed;
    }

}

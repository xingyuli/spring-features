package org.swordess.toy.spring.annotationbased.qualifier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.swordess.toy.spring.annotationbased.model.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:qualifier-annotation.xml")
public class DemonstrateQualifierAnnotation {

    @Autowired
    private QualifierAnnotationOnField usingQualifierOnField;

    @Autowired
    private QualifierAnnotationOnArgument usingQualifierOnArgument;

    @Test
    public void demonstrateQualifierAnnotationOnField() {
        assertEquals("Volvo", usingQualifierOnField.getVehicle().getBrand());

        List<String> expectedBrands = new ArrayList<String>();
        Collections.addAll(expectedBrands, "Normal A", "Normal B", "Normal C");
        for (Vehicle vehicle : usingQualifierOnField.getNormalVehicles()) {
            assertTrue(expectedBrands.contains(vehicle.getBrand()));
        }
    }

    @Test
    public void demonstrateQualifierAnnotationOnArgument() {
        assertEquals("Audi", usingQualifierOnArgument.getCrashed().getBrand());
    }

}

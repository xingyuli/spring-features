package org.swordess.toy.spring.annotationbased.autowired;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.swordess.toy.spring.annotationbased.model.Sequence;
import org.swordess.toy.spring.annotationbased.model.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:autowired-annotation.xml")
public class DemonstrateAutowiredAnnotation {

    @Autowired
    private AutowiredAnnotationOnSetterMethod usingAutowiredOnSetterMethod;

    @Autowired
    private AutowiredAnnotationOnArbitraryMethod usingAutowiredOnArbitraryMethod;

    @Autowired
    private AutowiredAnnotationOnConstructor usingAutowiredOnConstructor;

    @Autowired
    private AutowiredAnnotationOnField usingAutowiredOnField;

    @Test
    public void demonstrateAutowiredAnnotationOnSetterMethod() {
        assertEquals("I'm the Magic String!", usingAutowiredOnSetterMethod.getMagicString());
    }

    @Test
    public void demonstrateAutowiredAnnotationOnArbitraryMethod() {
        assertEquals(Integer.valueOf(1024), usingAutowiredOnArbitraryMethod.getMagicNumber());
    }

    @Test
    public void demonstrateAutowiredAnnotationOnConstructor() {
        assertEquals("I was born in the constructor.", usingAutowiredOnConstructor.getMagicConstructorArg());
    }

    @Test
    public void demonstrateAutowiredAnnotationOnField() {
        assertEquals("I was born in the field.", usingAutowiredOnField.getMagicField());

        List<String> expectedBrands = new ArrayList<String>();
        Collections.addAll(expectedBrands, "Volvo", "Audi", "Cadillac");

        for (Vehicle vehicle : usingAutowiredOnField.getVehiclesArray()) {
            assertTrue(expectedBrands.contains(vehicle.getBrand()));
        }

        for (Vehicle vehicle : usingAutowiredOnField.getVehiclesList()) {
            assertTrue(expectedBrands.contains(vehicle.getBrand()));
        }

        for (Map.Entry<String, Vehicle> entry : usingAutowiredOnField.getVehiclesMap().entrySet()) {
            System.out.println(entry);
            assertTrue(expectedBrands.contains(entry.getValue().getBrand()));
        }

        Sequence lastSequence = null;
        for (Sequence sequence : usingAutowiredOnField.getSequences()) {
            System.out.println(sequence);
            if (lastSequence != null) {
                assertTrue(lastSequence.getValue() < sequence.getValue());
            }
            lastSequence = sequence;
        }
    }

}

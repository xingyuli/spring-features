package org.swordess.toy.spring.annotationbased.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.swordess.toy.spring.annotationbased.model.Vehicle;

import java.util.List;

public class QualifierAnnotationOnField {

    // make use of the fallback match
    @Autowired
    @Qualifier("vehicle")
    private Vehicle vehicle;

    @Autowired
    @Qualifier("normal")
    private List<Vehicle> normalVehicles;

    public void setNormalVehicles(List<Vehicle> normalVehicles) {
        this.normalVehicles = normalVehicles;
    }

    public List<Vehicle> getNormalVehicles() {
        return normalVehicles;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}

package org.swordess.toy.spring.annotationbased.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.swordess.toy.spring.annotationbased.model.Sequence;
import org.swordess.toy.spring.annotationbased.model.Vehicle;

import java.util.List;
import java.util.Map;

/**
 * You can apply @Autowired to fields.
 * <p/>
 * It is also possible to provide all beans of a particular type from the
 * ApplicationContext by adding the annotation to a field or method that
 * expects an array or a collection of that type.
 * <p/>
 * Your beans can implement the org.springframework.core.Ordered interface
 * or use the the @Ordered annotation if you want items in the array or
 * list to be sorted into a specific order.
 * <p/>
 * Even typed Maps can be autowired as long as the expected key type is String.
 * The Map values will contain all beans of the expected type, and the keys
 * will contain the corresponding bean names.
 * <p/>
 * By default, the autowiring fails whenever zero candidate beans are
 * available; the default behavior is to treat annotated methods, constructors,
 * and fields as indicating required dependencies. This behavior can be changed
 * with required set to false.
 */
public class AutowiredAnnotationOnField {

    @Autowired
    private String magicField;

    @Autowired
    private Vehicle[] vehiclesArray;

    @Autowired
    private List<Vehicle> vehiclesList;

    @Autowired
    private Map<String, Vehicle> vehiclesMap;

    @Autowired(required = false)
    private List<Sequence> sequences;

    public void setMagicField(String magicField) {
        this.magicField = magicField;
    }

    public String getMagicField() {
        return magicField;
    }

    public void setVehiclesArray(Vehicle[] vehicles) {
        this.vehiclesArray = vehicles;
    }

    public Vehicle[] getVehiclesArray() {
        return vehiclesArray;
    }

    public void setVehiclesList(List<Vehicle> vehicles) {
        this.vehiclesList = vehicles;
    }

    public List<Vehicle> getVehiclesList() {
        return vehiclesList;
    }

    public void setVehiclesMap(Map<String, Vehicle> vehiclesMap) {
        this.vehiclesMap = vehiclesMap;
    }

    public Map<String, Vehicle> getVehiclesMap() {
        return vehiclesMap;
    }

    public void setSequences(List<Sequence> sequences) {
        this.sequences = sequences;
    }

    public List<Sequence> getSequences() {
        return sequences;
    }

}

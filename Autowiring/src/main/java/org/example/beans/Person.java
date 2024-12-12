package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name="Lucy";
    //Autowire by class field but not required in production as it is not final
//    @Autowired
    private final Vehicle vehicle;

    @Autowired
    //constructor is autowired if we have one and only constructor then Autowired is optional
    public Person(Vehicle vehicle){
        System.out.println("Person constructor with vehicle parameter" );
        this.vehicle=vehicle;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
//    @Autowired
    //Not recommended for production either this is setting by setter
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
}

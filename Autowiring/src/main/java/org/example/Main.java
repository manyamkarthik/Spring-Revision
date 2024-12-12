package org.example;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.configuration.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
       var person=context.getBean(Person.class);
       var veh=context.getBean(Vehicle.class);
        System.out.println(person.getVehicle().getName() +"  " +person.getName());
        veh.getVehicleServices().makeSound();
        veh.getVehicleServices().rotate();
        veh.getVehicleServices().setSpeakerName("JBL");
        veh.getVehicleServices().makeSound();
        veh.getVehicleServices().setTyreName("Michelin");
        veh.getVehicleServices().rotate();



    }
}
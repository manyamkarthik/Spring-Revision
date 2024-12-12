package org.example.configuration;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.beans")
public class ProjectConfig {

//    @Bean
//    public Vehicle getVehicle(){
//        Vehicle vehicle=new Vehicle();
//        vehicle.setName("Audi");
//        return  vehicle;
//    }
//    @Bean
//    public Person getPerson(){
//        Person person=new Person();
//        person.setName("Louis");
//        person.setVehicle(getVehicle());
//        return person;
//    }
    //calling by method parameter
//    @Bean
//    public  Person personBean(Vehicle vehicle){
//        Person person=new Person();
//        person.setName("Lucy");
//        person.setVehicle(vehicle);
//        return person;
//    }


}

package org.example;

import org.example.beans.Vehicle;
import org.example.configuration.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {



        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Supplier<Vehicle> volksweganSupplier=() ->{
            var vehicle=new Vehicle();
            vehicle.setName("volkswegan");
            return  vehicle;
        };
        Supplier<Vehicle> AudiSupplier=() ->{
            var vehicle=new Vehicle();
            vehicle.setName("Audi");
            return  vehicle;
        };
        Random random=new Random();
        int randomNumber=random.nextInt(10);
        if(randomNumber%2==0){
            context.registerBean("volkswegan", Vehicle.class,volksweganSupplier);

        }
        else{
            context.registerBean("Audi", Vehicle.class,AudiSupplier);
        }
        try{
            var volkswegan=context.getBean("volkswegan",Vehicle.class);
            System.out.println(volkswegan.getName());
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println(noSuchBeanDefinitionException.getBeanName());
        }
        try{
            var Audi=context.getBean("Audi",Vehicle.class);
            System.out.println(Audi.getName());
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println(noSuchBeanDefinitionException.getBeanName());
        }
        context.close();

    }
}
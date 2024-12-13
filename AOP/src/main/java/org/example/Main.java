package org.example;

import org.example.config.ProjectConfig;
import org.example.model.Song;
import org.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicleServices=context.getBean(VehicleServices.class);
        System.out.println(vehicleServices.getClass());
        boolean vehicleStarted=true;
        Song song=new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");
        String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleServices.playMusic(vehicleStarted,song);
        String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);
        System.out.println(moveVehicleStatus);
        System.out.println(playMusicStatus);
        System.out.println(applyBrakeStatus);
    }
}
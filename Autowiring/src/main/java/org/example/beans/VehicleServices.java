package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class VehicleServices implements Tyres,Speakers {
    private String speakerName;
    private String tyreName;

    public String getTyreName() {
        return tyreName;
    }

    public void setTyreName(String tyreName) {
        this.tyreName = tyreName;
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    @Override
    public void makeSound() {

        System.out.println(getSpeakerName()+"playing sound");

    }

    @Override
    public void rotate() {

        System.out.println(getTyreName()+"Rotating");

    }
}

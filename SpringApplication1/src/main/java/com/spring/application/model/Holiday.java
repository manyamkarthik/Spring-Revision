package com.spring.application.model;


import jakarta.persistence.*;

@Table(name="holidays")
@Entity
public class Holiday extends BaseEntity {
    public Holiday() {
    }

    @Id
    private  String day;
    private  String reason;
    @Enumerated(EnumType.STRING)
    private  Type type;

    public String getDay() {
        return day;
    }

    public String getReason() {
        return reason;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        FESTIVAL, FEDERAL
    }

    public Holiday(String day, String reason, Type type) {
        this.day = day;
        this.reason = reason;
        this.type = type;
    }


}
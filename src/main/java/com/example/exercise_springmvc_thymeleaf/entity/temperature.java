package com.example.exercise_springmvc_thymeleaf.entity;

import java.util.Objects;

public class temperature {

    private int id;
    private String name;
    private boolean fever;
    private double hyperthermia;
    private double bodyTemperature;

    public temperature() {
    }

    public temperature(int id, String name, boolean fever, double hyperthermia, double bodyTemperature) {
        this.id = id;
        this.name = name;
        this.fever = fever;
        this.hyperthermia = hyperthermia;
        this.bodyTemperature = bodyTemperature;
    }

    public temperature(String name, boolean fever, double hyperthermia, double bodyTemperature) {
        this.name = name;
        this.fever = fever;
        this.hyperthermia = hyperthermia;
        this.bodyTemperature = bodyTemperature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFever() {
        return fever;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public double getHyperthermia() {
        return hyperthermia;
    }

    public void setHyperthermia(double hyperthermia) {
        this.hyperthermia = hyperthermia;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        temperature that = (temperature) o;
        return id == that.id &&
                fever == that.fever &&
                Double.compare(that.hyperthermia, hyperthermia) == 0 &&
                Double.compare(that.bodyTemperature, bodyTemperature) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, fever, hyperthermia, bodyTemperature);
    }
}

package com.bicyclerentals.legendary.models;

public class Bicycle {

    private String bicycleId;
    private String name;

    public Bicycle(){

    }

    public Bicycle(String bicycleId, String name) {
        this.bicycleId = bicycleId;
        this.name = name;
    }

    public String getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(String bicycleId) {
        this.bicycleId = bicycleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

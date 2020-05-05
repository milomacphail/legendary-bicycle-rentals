package com.bicyclerentals.legendary.models;

public class BicycleRating {
    private String bicycleId;
    private int bicycleRating;

    public BicycleRating(){
    }

    public BicycleRating(String bicycleId, int bicycleRating) {
        this.bicycleId = bicycleId;
        this.bicycleRating = bicycleRating;
    }

    public String getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(String bicycleId) {
        this.bicycleId = bicycleId;
    }

    public int getBicycleRating() {
        return bicycleRating;
    }

    public void setBicyleRating(int bicycleRating) {
        this.bicycleRating= bicycleRating;
    }
}

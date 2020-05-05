package com.bicyclerentals.legendary.models;

public class CatalogItem {

    private String name;
    private String desc;
    private int bicycleRating;

    public CatalogItem(String name, String desc, int bicycleRating) {
        this.name = name;
        this.desc = desc;
        this.bicycleRating = bicycleRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getBicycleRating() {
        return bicycleRating;
    }

    public void setBicycleRating(int rating) {
        this.bicycleRating = rating;
    }

}



package com.bicyclerentals.legendary.models;

import java.util.List;

public class UserRating {

    private List<BicycleRating> userRating;

    public List<BicycleRating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<BicycleRating> userRating) {
        this.userRating = userRating;
    }
}

package com.pluralsight.model;

/**
 * Created by jakerman on 08/02/2017.
 */
public class Activity {

    private String description;

    public Activity(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.pluralsight.model;

import org.hibernate.validator.constraints.Range;

/**
 * Created by jakerman on 08/02/2017.
 */
public class Goal {

    @Range(min = 1, max = 120)
    public int minutes;

    public Goal() {
    }

    public Goal(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}

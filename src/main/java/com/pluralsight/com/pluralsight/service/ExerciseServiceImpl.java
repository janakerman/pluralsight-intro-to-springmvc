package com.pluralsight.com.pluralsight.service;

import com.pluralsight.model.Activity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakerman on 08/02/2017.
 */
@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

    public List<Activity> findAllActivities() {

        List<Activity> activities = new ArrayList<Activity>();

        activities.add(new Activity("Run"));
        activities.add(new Activity("Swim"));
        activities.add(new Activity("Skip"));

        return activities;
    }

}

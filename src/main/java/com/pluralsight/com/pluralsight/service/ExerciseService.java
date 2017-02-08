package com.pluralsight.com.pluralsight.service;

import com.pluralsight.model.Activity;

import java.util.List;

/**
 * Created by jakerman on 08/02/2017.
 */
public interface ExerciseService {
    List<Activity> findAllActivities();
}

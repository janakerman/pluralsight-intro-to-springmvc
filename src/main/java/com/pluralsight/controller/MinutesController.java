package com.pluralsight.controller;

import com.pluralsight.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jakerman on 07/02/2017.
 */
@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinuets(@ModelAttribute("exercise") Exercise exercise) {

        System.out.println("Exercise: " + exercise.getMinutes());

        return "addMinutes";
    }

//    @RequestMapping(value = "/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
//
//        System.out.println("exercising: " + exercise.getMinutes());
//
//        return "addMinutes";
//    }

}

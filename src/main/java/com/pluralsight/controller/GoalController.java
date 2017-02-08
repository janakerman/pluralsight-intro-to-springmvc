package com.pluralsight.controller;

import com.pluralsight.model.Goal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

/**
 * Created by jakerman on 08/02/2017.
 */
@Controller
@SessionAttributes("goal")
public class GoalController {

    // Accepts GET request and adds goal to the page model. Sends request through addGoal JSP template.
    @RequestMapping(value = "addGoal", method = RequestMethod.GET)
    public String addGoal(Model model) {
        Goal goal = new Goal(10);
        model.addAttribute("goal", goal);
        System.out.println("GET goal: " + goal.minutes);

        return "addGoal";
    }

    // Takes model goal - which is stoed in session due to @SessionAttributes, then redirects to addMinutes page to display goal.
    @RequestMapping(value = "addGoal", method = RequestMethod.POST)
    public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result) {
        System.out.println("Result has errors: " + result.hasErrors());

        System.out.println("POST goal: " + goal.minutes);

        if (result.hasErrors()) {
            return "addGoal";
        }

        return "redirect:addMinutes.html";
    }

}

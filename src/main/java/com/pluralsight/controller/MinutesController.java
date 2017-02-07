package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jakerman on 07/02/2017.
 */
@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinuets() {
        return "addMinutes";
    }

}

package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jakerman on 07/02/2017.
 */
@Controller
public class HelloController {

    /* This function can be named whatever we want.
    By annotating it to a request mapping we tell the dispatcher to call this function when we match /greeting.
    By having a Model object parameters, we set this model object as the model for our view.
     */
    @RequestMapping(value = "/greeting")
    public String sayHello(Model model) {

        model.addAttribute("greeting", "Hello Jan");

        System.out.println("Test");

        // Go to the 'hello' JSP page.
        return "hello";
    }

}

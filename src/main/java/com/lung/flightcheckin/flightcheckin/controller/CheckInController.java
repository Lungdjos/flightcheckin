package com.lung.flightcheckin.flightcheckin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CheckInController {

    // method to show the Checking page
    @RequestMapping("/showCheckIn")
    public String startCheckIn(){
        return "startCheckIn";
    }
}

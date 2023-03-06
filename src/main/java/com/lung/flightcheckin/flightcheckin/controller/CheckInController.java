package com.lung.flightcheckin.flightcheckin.controller;

import com.lung.flightcheckin.flightcheckin.integration.ReservationRestClient;
import com.lung.flightcheckin.flightcheckin.integration.dto.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CheckInController {
    @Autowired
    private ReservationRestClient reservationRestClient;

    // method to show the Checking page
    @RequestMapping("/showCheckIn")
    public String showCheckIn(){
        return "startCheckIn";
    }

    // method handling the start check in
    @RequestMapping("/startCheckIn")
    public String startCheckIn(@RequestParam("reservationId") int reservationId, ModelMap modelMap){
        Reservation reservation = reservationRestClient.findReservation(reservationId);
        modelMap.addAttribute("reservation", reservation);
        return "displayReservationDetails";
    }
}

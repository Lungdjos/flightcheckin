package com.lung.flightcheckin.flightcheckin.controller;

import com.lung.flightcheckin.flightcheckin.integration.ReservationRestClient;
import com.lung.flightcheckin.flightcheckin.integration.dto.Reservation;
import com.lung.flightcheckin.flightcheckin.integration.dto.ReservationUpdateRequest;
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

    // methods to complete check in
    @RequestMapping("/completeCheckIn")
    public String completeCheckIn(@RequestParam("reservationId") int reservationId,
                                  @RequestParam("numberOfBags") int numberOfBags){
        // creating an object of the update class
        ReservationUpdateRequest reservationUpdateRequest = new ReservationUpdateRequest();
        reservationUpdateRequest.setId(reservationId);
        reservationUpdateRequest.setCheckedIn(true);
        reservationUpdateRequest.setNumberOfBags(numberOfBags);

        // calling the update method
        reservationRestClient.updateReservation(reservationUpdateRequest);
        return "checkInConfirmation";
    }
}

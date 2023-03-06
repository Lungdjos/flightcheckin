package com.lung.flightcheckin.flightcheckin.integration;

import com.lung.flightcheckin.flightcheckin.integration.dto.Reservation;

public interface ReservationRestClient {
    // the class will make service calls to the flight reservation app
    Reservation findReservation(int id);
    Reservation updateReservation();

}

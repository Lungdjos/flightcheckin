package com.lung.flightcheckin.flightcheckin.integration.implementation;

import com.lung.flightcheckin.flightcheckin.integration.ReservationRestClient;
import com.lung.flightcheckin.flightcheckin.integration.dto.Reservation;
import com.lung.flightcheckin.flightcheckin.integration.dto.ReservationUpdateRequest;
import org.springframework.web.client.RestTemplate;

public class ReservationRestClientImpl implements ReservationRestClient {
    @Override
    public Reservation findReservation(int id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8080/flightreservationmgt/"+id,
                Reservation.class);
    }

    @Override
    public Reservation updateReservation(ReservationUpdateRequest reservationUpdateRequest) {
        return null;
    }
}

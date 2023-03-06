package com.lung.flightcheckin.flightcheckin.integration.implementation;

import com.lung.flightcheckin.flightcheckin.integration.ReservationRestClient;
import com.lung.flightcheckin.flightcheckin.integration.dto.Reservation;
import com.lung.flightcheckin.flightcheckin.integration.dto.ReservationUpdateRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {
    // the url static variable
    private static final String RESERVATION_REST_URL = "http://localhost:8080/flightreservationmgt/";
    @Override
    public Reservation findReservation(int id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(RESERVATION_REST_URL+id,
                Reservation.class);
    }

    @Override
    public Reservation updateReservation(ReservationUpdateRequest reservationUpdateRequest) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.patchForObject(RESERVATION_REST_URL,
                reservationUpdateRequest, Reservation.class);
    }
}

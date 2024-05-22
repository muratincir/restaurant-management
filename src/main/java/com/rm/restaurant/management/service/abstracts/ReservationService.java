package com.rm.restaurant.management.service.abstracts;

import com.rm.restaurant.management.dto.ReservationDto;
import com.rm.restaurant.management.model.Reservation;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    List<Reservation> getAllReservation(Optional<Long> reservationId);

    Reservation createOneReservation(Reservation newReservationDto);

    Reservation updateOneReservation(Long reservationId,Reservation updateReservation);

    ResponseEntity<?> deleteAllReservation(Optional<Long> reservationId);
}

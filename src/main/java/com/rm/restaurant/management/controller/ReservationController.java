package com.rm.restaurant.management.controller;

import com.rm.restaurant.management.model.Reservation;
import com.rm.restaurant.management.service.abstracts.ReservationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/reservation")
public class ReservationController {
    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/get/{reservationId}")
    public List<Reservation> getAllReservation(@RequestParam Optional<Long> reservationId){
        return reservationService.getAllReservation(reservationId);
    }

    @PostMapping("/create")
    public Reservation createOneReservation(@RequestBody Reservation newReservation){
        return reservationService.createOneReservation(newReservation);
    }

    @PutMapping("/update/{reservationId}")
    public Reservation updateOneReservation(@PathVariable Long reservationId , @RequestBody Reservation updateReservation){
        return reservationService.updateOneReservation(reservationId,updateReservation);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteAllReservation(@RequestParam Optional<Long> reservationId){
        return reservationService.deleteAllReservation(reservationId);
    }

}

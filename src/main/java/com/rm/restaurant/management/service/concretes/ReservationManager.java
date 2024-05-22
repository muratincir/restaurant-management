package com.rm.restaurant.management.service.concretes;

import com.rm.restaurant.management.dto.ReservationDto;
import com.rm.restaurant.management.model.Reservation;
import com.rm.restaurant.management.repository.ReservationRepo;
import com.rm.restaurant.management.service.abstracts.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationManager implements ReservationService {
    private ReservationRepo reservationRepo;

    public ReservationManager(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }

    @Override
    public List<Reservation> getAllReservation(Optional<Long> reservationId) {
        if(reservationId.isPresent()){
            long id = reservationId.get();

            // Repodan dönüş değerini Optional türüne dönderme işlemi
            Optional<Reservation> optionalReservation = reservationRepo.findById(id);

            // Optional içinde olan Reservation değerini işleme (Tek elemanlı liste)
            return optionalReservation.map(List::of).orElse(List.of());
        }else{
            return reservationRepo.findAll();
        }
    }

    @Override
    public Reservation createOneReservation(Reservation newReservation) {
        return reservationRepo.save(newReservation);
    }

    @Override
    public Reservation updateOneReservation(Long reservationId,Reservation updateReservation) {
        Optional<Reservation> reservation = reservationRepo.findById(reservationId);
        if(reservation.isPresent()){
            Reservation foundReservation = reservation.get();
            foundReservation.setReservationTime(updateReservation.getReservationTime());
            foundReservation.setTableNumber(updateReservation.getTableNumber());
            foundReservation.setNumberOfPeople(updateReservation.getNumberOfPeople());
            foundReservation.setCustomerName(updateReservation.getCustomerName());
            return foundReservation;
        }else{
            return null;
        }
    }

    @Override
    public ResponseEntity<?> deleteAllReservation(Optional<Long> reservationId) {
        if(reservationId.isPresent()){
            Long id = reservationId.get();
            Optional<Reservation> optionalReservation = reservationRepo.findById(id);
            if (optionalReservation.isPresent()){
                reservationRepo.deleteById(id);
                return ResponseEntity.ok("Rezervasyonunuz başarıyla silinmiştir");
            }else{
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Verdiğiniz id için rezervasyon bulunamadı");
            }
        }else{
            reservationRepo.deleteAll();
            return ResponseEntity.ok("Tüm rezervasyonlar başarıyla silinmiştir");
        }
    }
}

package com.rm.restaurant.management.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReservationDto {
    private Long id;
    private String customerName;
    private LocalDateTime reservationTime;
    private Integer numberOfPeople;
    private Integer tableNumber;
    private Long orderId;
}

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
public class DailySalesDto {
    private Long id;
    private LocalDateTime date;
    private Integer totalSalesAmount;
    private Integer numberOfOrders;
    private Long orderId;
}

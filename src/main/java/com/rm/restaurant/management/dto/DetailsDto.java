package com.rm.restaurant.management.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DetailsDto {
    private Long id;
    private Integer quantity;
    private Long orderId;
    private Long dailySalesId;
}

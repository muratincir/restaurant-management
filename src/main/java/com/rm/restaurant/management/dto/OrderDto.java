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
public class OrderDto {
        private Long id;
        private Integer tableNumber;
        private LocalDateTime orderTime;
        private Boolean status;
        private Long menuId;
}

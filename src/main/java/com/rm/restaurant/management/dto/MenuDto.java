package com.rm.restaurant.management.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class MenuDto {
    private Long id;

    private String name;

    private String description;

    private Double price;
}

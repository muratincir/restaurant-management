package com.rm.restaurant.management.service.abstracts;

import com.rm.restaurant.management.dto.DetailsDto;
import com.rm.restaurant.management.model.Details;

import java.util.List;

public interface DetailsService {
    List<Details> getAllDetails();
}

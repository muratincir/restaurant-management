package com.rm.restaurant.management.service.abstracts;

import com.rm.restaurant.management.dto.DailySalesDto;
import com.rm.restaurant.management.model.DailySales;

import java.util.List;

public interface DailySalesService {
    List<DailySales> getAllDailySales();
}

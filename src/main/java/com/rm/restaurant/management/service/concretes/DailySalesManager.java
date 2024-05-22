package com.rm.restaurant.management.service.concretes;

import com.rm.restaurant.management.dto.DailySalesDto;
import com.rm.restaurant.management.model.DailySales;
import com.rm.restaurant.management.repository.DailySalesRepo;
import com.rm.restaurant.management.service.abstracts.DailySalesService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DailySalesManager implements DailySalesService {
    private DailySalesRepo dailySalesRepo;
    @Override
    public List<DailySales> getAllDailySales() {
        return dailySalesRepo.findAll();
    }
}

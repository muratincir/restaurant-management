package com.rm.restaurant.management.controller;

import com.rm.restaurant.management.model.DailySales;
import com.rm.restaurant.management.service.abstracts.DailySalesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dailysales")
public class DailySalesController {
    private DailySalesService dailySalesService;

    public DailySalesController(DailySalesService dailySalesService) {
        this.dailySalesService = dailySalesService;
    }

    @GetMapping("/get")
    public List<DailySales> getAllDailySales() {
        return dailySalesService.getAllDailySales();
    }

}

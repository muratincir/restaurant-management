package com.rm.restaurant.management.controller;

import com.rm.restaurant.management.model.Details;
import com.rm.restaurant.management.service.abstracts.DetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/details")
public class DetailsController {
    private DetailsService detailsService;

    public DetailsController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }

    @GetMapping("/get")
    public List<Details> getAllDetails(){
        return detailsService.getAllDetails();
    }
}

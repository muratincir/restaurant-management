package com.rm.restaurant.management.service.concretes;

import com.rm.restaurant.management.model.Details;
import com.rm.restaurant.management.repository.DetailsRepo;
import com.rm.restaurant.management.service.abstracts.DetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsManager implements DetailsService {
    private DetailsRepo detailsRepo;

    public DetailsManager(DetailsRepo detailsRepo) {
        this.detailsRepo = detailsRepo;
    }

    @Override
    public List<Details> getAllDetails() {
        return detailsRepo.findAll();
    }
}

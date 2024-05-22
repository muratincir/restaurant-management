package com.rm.restaurant.management.repository;

import com.rm.restaurant.management.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepo extends JpaRepository<Details,Long> {
}

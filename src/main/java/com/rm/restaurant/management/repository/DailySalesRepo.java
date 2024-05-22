package com.rm.restaurant.management.repository;

import com.rm.restaurant.management.model.DailySales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailySalesRepo extends JpaRepository<DailySales,Long> {
}

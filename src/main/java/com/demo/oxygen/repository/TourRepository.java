package com.demo.oxygen.repository;


import com.demo.oxygen.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TourRepository extends JpaRepository {
    List<Tour> findByTourPackageCode(String code);

}

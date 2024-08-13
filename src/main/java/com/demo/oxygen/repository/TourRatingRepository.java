package com.demo.oxygen.repository;

import com.demo.oxygen.entity.TourRating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface TourRatingRepository extends JpaRepository<TourRating, Integer> {


    List<TourRating> findByTourId(Integer tourId);

    Optional<TourRating> findByTourIdAndCustomerId(Integer tourId, Integer customerId);
}

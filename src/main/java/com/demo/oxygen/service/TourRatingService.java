package com.demo.oxygen.service;

import com.demo.oxygen.entity.TourRating;
import com.demo.oxygen.repository.TourPackageResposity;
import com.demo.oxygen.repository.TourRatingRepository;
import com.demo.oxygen.repository.TourRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class TourRatingService {

    private TourPackageResposity   tourPackageResposity;
    private TourRepository        tourRepository;
    private TourRatingRepository tourRatingRepository;

    public TourRatingService(TourRatingRepository tourRatingRepository, TourRepository tourRepository){
        this.tourRatingRepository = tourRatingRepository;
        this.tourRepository = tourRepository;
    }


    public TourRating createNew( Integer tourId, Integer customerId, Integer score, String comment ) throws NoSuchElementException {
        return tourRatingRepository.save(( new TourRating()));
    }
}

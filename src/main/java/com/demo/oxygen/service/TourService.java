package com.demo.oxygen.service;

import java.util.List;

import com.demo.oxygen.entity.Tour;
import com.demo.oxygen.entity.TourPackage;
import com.demo.oxygen.repository.TourPackageResposity;
import com.demo.oxygen.repository.TourRepository;
import org.springframework.stereotype.Service;

@Service
public class TourService {
    private TourPackageResposity tourPackageResposity;
    private TourRepository tourRepository;

    public TourService( TourPackageResposity tourPackageResposity, TourRepository tourRepository) {
        this.tourPackageResposity = tourPackageResposity;
        this.tourRepository = tourRepository;
    }

    public Tour createTour(  String title, String description, Integer price, String duration ){
        return (Tour) tourRepository.save(new Tour(title, description, price, duration));
    }

    public long total(){
        return tourRepository.count();
    }


}

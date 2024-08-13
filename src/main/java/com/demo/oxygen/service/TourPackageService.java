package com.demo.oxygen.service;

import com.demo.oxygen.entity.TourPackage;
import com.demo.oxygen.repository.TourPackageResposity;
import com.demo.oxygen.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


// business logic
@Service
public class TourPackageService {
    private TourRepository tourRepository;

    @Autowired
    private TourPackageResposity tourPackageResposity;


    public TourPackageService(  TourPackageResposity tourPackageRepo) {
        this.tourPackageResposity = tourPackageRepo;
    }

    public TourPackage createTourPackage(String code, String name) {
        return tourPackageResposity.findById(code)
                .orElse(tourPackageResposity.save(new TourPackage(code, name)));
    }

    public List<TourPackage> getAllTourPackages() {
        return tourPackageResposity.findAll();
    }

    public long total(){
        return tourPackageResposity.count();
    }



}

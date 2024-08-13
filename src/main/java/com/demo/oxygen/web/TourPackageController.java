package com.demo.oxygen.web;

import com.demo.oxygen.entity.TourPackage;
import com.demo.oxygen.service.TourPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/packages")
public class TourPackageController {

    TourPackage tourPackage;

//    @Autowired
    TourPackageService tourPackageService;

    public TourPackageController(TourPackageService tourPackageService) {
        this.tourPackageService = tourPackageService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/index", produces = "text/pain")
     public String index(){
        return tourPackageService.getAllTourPackages()
                .stream().findFirst().toString();
    }


}

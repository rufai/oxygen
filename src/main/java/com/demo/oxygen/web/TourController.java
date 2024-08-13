package com.demo.oxygen.web;

import com.demo.oxygen.service.TourService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tours")
public class TourController {

    private TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/index", produces = "text/pain")
    public String index(){
        return tourService.getAllTour()
                .stream().findFirst().toString();

    }




}

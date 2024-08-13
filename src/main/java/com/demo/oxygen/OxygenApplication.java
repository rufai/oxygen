package com.demo.oxygen;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.demo.oxygen.service.TourPackageService;
import com.demo.oxygen.service.TourService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OxygenApplication implements CommandLineRunner {
    private static final String TOUR_FILE = "ExploreCalifornia.json";

    @Autowired
    private TourPackageService tourPackageService;

    @Autowired
    private TourService tourService;

    public static void main(String[] args)  {
        SpringApplication.run(OxygenApplication.class, args);

        /*
            1- get access to the json
            2- pass access to the repository
            3- the service can communicate with the repository
         *
         /

         web api -> request -> controller -> model ( service -> repository -> )
          read/
         */
    }

    @Override
    public void run(String... args) throws Exception {
        createTourPackages();
//        createToursFromFile(TOUR_FILE);
    }

    private void createTourPackages(){
        tourPackageService.createTourPackage("sw", "Swimming");
        tourPackageService.createTourPackage("ru", "Running");
        tourPackageService.createTourPackage("da", "Dancing");
        tourPackageService.createTourPackage("ju", "Jumping");
        tourPackageService.createTourPackage("sk", "Skating");
        tourPackageService.createTourPackage("cy", "Cycling");
    }


    //     1- get access to the json
    private void createToursFromFile(String fileToImport) throws IOException {
        TourFromFile.read(fileToImport)
                .forEach(t -> tourService.createTour(
                        t.title(),
                        t.description(),
                        t.price()
                ));
    }

    // helper function
    record TourFromFile(
            String title,
            String description,
            Integer price ) {
        static List<TourFromFile> read(String fileToImport) throws IOException {
            return new ObjectMapper().readValue(new File(fileToImport),
                    new TypeReference<List<TourFromFile>>(){});
        }
    }
}

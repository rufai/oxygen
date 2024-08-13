package com.demo.oxygen.repository;

import com.demo.oxygen.entity.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TourPackageResposity extends JpaRepository<TourPackage, String> {
    Optional<TourPackage> findByName(String name);
}

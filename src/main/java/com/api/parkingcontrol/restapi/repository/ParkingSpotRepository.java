package com.api.parkingcontrol.restapi.repository;

import com.api.parkingcontrol.restapi.models.ParkingSpotModel;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);

    boolean existsByApartmentAndBlock(String apartment, String block);

    Optional<ParkingSpotModel> findById(java.util.UUID id);
}


package net.parkingsystem.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.parkingsystem.parking.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}

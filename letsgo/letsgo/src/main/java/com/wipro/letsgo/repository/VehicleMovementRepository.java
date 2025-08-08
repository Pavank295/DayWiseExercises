package com.wipro.letsgo.repository;
import com.wipro.letsgo.entity.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Long> {
}

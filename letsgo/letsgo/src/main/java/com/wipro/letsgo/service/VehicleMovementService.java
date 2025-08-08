package com.wipro.letsgo.service;
import com.wipro.letsgo.dto.VehicleMovementRequest;
import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.repository.VehicleMovementRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class VehicleMovementService {

    private final VehicleMovementRepository repository;

    public VehicleMovementService(VehicleMovementRepository repository) {
        this.repository = repository;
    }

    public VehicleMovement saveMovement(VehicleMovementRequest request) {
        VehicleMovement movement = new VehicleMovement();
        movement.setVehId(request.getVehId());
        movement.setLat(request.getLat());
        movement.setLongitude(request.getLongitude());
        movement.setMovementTime(LocalDateTime.now());

        return repository.save(movement);
    }
}

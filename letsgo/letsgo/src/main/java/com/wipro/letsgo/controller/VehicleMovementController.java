package com.wipro.letsgo.controller;
import com.wipro.letsgo.dto.VehicleMovementRequest;
import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.service.VehicleMovementService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/move")
public class VehicleMovementController {

    private final VehicleMovementService service;

    public VehicleMovementController(VehicleMovementService service) {
        this.service = service;
    }

    @PostMapping
    public VehicleMovement moveVehicle(@RequestBody VehicleMovementRequest request) {
        return service.saveMovement(request);
    }
}

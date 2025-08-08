package com.wipro.letsgo.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "vehicle_movement")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long vehId;
    private Double lat;
    private Double longitude;

    private LocalDateTime movementTime;
}

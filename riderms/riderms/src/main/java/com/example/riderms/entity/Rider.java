package com.example.riderms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Rider {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String pickup;
    private String dropLocation;
    private String status;
}

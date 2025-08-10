package com.example.carms.service;

import com.example.carms.model.Car;
import com.example.carms.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    public Car updateCar(Long id, Car updatedCar) {
        return carRepository.findById(id)
                .map(car -> {
                    car.setMake(updatedCar.getMake());
                    car.setRegistrationDetail(updatedCar.getRegistrationDetail());
                    return carRepository.save(car);
                })
                .orElseThrow();
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}

package com.wipro.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.repo.CarRepo;
@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;

    public List<String> getCarList() {
        return carRepo.getCars();
    }
}


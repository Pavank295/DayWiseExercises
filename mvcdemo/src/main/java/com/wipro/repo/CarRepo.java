package com.wipro.repo;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;
@Repository
public class CarRepo {
    public List<String> getCars() {
        return Arrays.asList("Audi", "Mercedes", "BMW");
    }
}


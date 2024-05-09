package com.jota.sanfelipe.repository;

import com.jota.sanfelipe.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByPlaca(String placa);
}

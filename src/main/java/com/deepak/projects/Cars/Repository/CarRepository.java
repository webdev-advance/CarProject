package com.deepak.projects.Cars.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.projects.Cars.Models.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

	Car getCarByName(String name);

}

package com.deepak.projects.Cars.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.projects.Cars.Exceptions.CarNotFoundException;
import com.deepak.projects.Cars.Models.Car;
import com.deepak.projects.Cars.Repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;
	
	public Car getCarDetails(String name) {
		Car car= carRepository.getCarByName(name);
		
		if(car==null){
			throw new CarNotFoundException();
		}
		
		return car;
	}

}

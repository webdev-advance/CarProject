package com.deepak.projects.Cars.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.projects.Cars.Models.Car;
import com.deepak.projects.Cars.Services.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	private CarService carService;
	
	@GetMapping("/{name}")
	public Car getCars(@PathVariable String name){
		return carService.getCarDetails(name);
	}	
}

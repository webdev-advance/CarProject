package com.deepak.projects.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deepak.projects.Cars.Models.Car;
import com.deepak.projects.Cars.Repository.CarRepository;

@SpringBootApplication
public class CarsApplication implements CommandLineRunner{

	@Autowired
	private CarRepository carRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CarsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		carRepository.save(new Car("prius","hybrid"));
	}

}

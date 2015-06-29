package com.church.conference.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.conference.model.Car;
import com.church.conference.repository.CarRepository;

@RestController
public class CarController {

	@Autowired
	CarRepository carRepository;
	
	@RequestMapping(value = "/cars")
	List<Car> findAll(){
		return carRepository.findAll();
	}
	
	@RequestMapping(value = "/cars/{carId}")
	Car findById(@PathVariable long carId){
		return carRepository.findById(carId);
	}
}

package com.church.conference.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.conference.model.Car;
import com.church.conference.model.Local;
import com.church.conference.service.CarRepository;

@RestController
public class CarController {

	@Autowired
	CarRepository carRepository;
	
	@RequestMapping(value = "/allCars")
	List<Car> findAll(){
		return carRepository.findAll();
	}
}

package com.church.conference.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.conference.model.CarSaint;
import com.church.conference.model.Saint;
import com.church.conference.service.CarSaintRepository;
import com.church.conference.service.SaintRepository;

@RestController
public class AssignController {

	@Autowired
	CarSaintRepository carSaintRepository;
	
	@RequestMapping(value = "/assign/cars")
	List<CarSaint> findAll(){
		return carSaintRepository.findAll();
	}
	
	@RequestMapping(value = "/assign/cars/{saintId}")
	CarSaint findById(@PathVariable long saintId){
		return carSaintRepository.findById(saintId);
	}
}

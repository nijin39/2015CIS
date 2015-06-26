package com.church.conference.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.conference.model.CarSaint;
import com.church.conference.model.RoomSaint;
import com.church.conference.service.CarSaintRepository;
import com.church.conference.service.RoomSaintRepository;

@RestController
public class AssignController {

	@Autowired
	CarSaintRepository carSaintRepository;
	
	@Autowired
	RoomSaintRepository roomSaintRepository;
	
	@RequestMapping(value = "/assign/cars")
	List<CarSaint> findAssignCarAll(){
		return carSaintRepository.findAll();
	}
	
	@RequestMapping(value = "/assign/cars/{saintId}")
	CarSaint findAssignCarById(@PathVariable long saintId){
		return carSaintRepository.findById(saintId);
	}
	
	@RequestMapping(value = "/assign/rooms")
	List<RoomSaint> findAssignRoomAll(){
		return roomSaintRepository.findAll();
	}
	
	@RequestMapping(value = "/assign/rooms/{roomSaintId}")
	RoomSaint findAssignRoomById(@PathVariable long roomSaintId){
		return roomSaintRepository.findById(roomSaintId);
	}
}

package com.church.conference.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.conference.model.Room;
import com.church.conference.repository.RoomRepository;

@RestController
public class RoomController {

	@Autowired
	RoomRepository roomRepository;
	
	@RequestMapping(value = "/rooms")
	List<Room> findAll(){
		return roomRepository.findAll();
	}
	
	@RequestMapping(value = "/rooms/{roomId}")
	Room findById(@PathVariable long roomId){
		return roomRepository.findById(roomId);
	}
}

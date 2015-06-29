package com.church.conference.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.conference.model.Saint;
import com.church.conference.repository.SaintRepository;

@RestController
public class SaintController {

	@Autowired
	SaintRepository saintRepository;
	
	@RequestMapping(value = "/saints")
	List<Saint> findAll(){
		return saintRepository.findAll();
	}
	
	@RequestMapping(value = "/saints/{saintId}")
	Saint findById(@PathVariable long saintId){
		return saintRepository.findById(saintId);
	}
}

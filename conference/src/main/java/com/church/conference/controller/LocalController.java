package com.church.conference.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.conference.model.Car;
import com.church.conference.model.Local;
import com.church.conference.service.LocalRepository;

@RestController
public class LocalController {

	@Autowired
	LocalRepository localRepository;
	
	@RequestMapping(value = "/locals")
	List<Local> findAll(){
		return localRepository.findAll();
	}
	
	@RequestMapping(value = "/locals/{localId}")
	Local findById(@PathVariable long localId){
		return localRepository.findById(localId);
	}
}

package com.church.conference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.conference.model.Groups;
import com.church.conference.model.Local;
import com.church.conference.service.LocalRepository;

@RestController
public class LocalController {

	@Autowired
	LocalRepository localRepository;
	
	@RequestMapping(value = "/allLocals")
	Iterable<Local> findAll(){
		return localRepository.findAll();
	}
}

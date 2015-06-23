package com.church.conference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.conference.model.Groups;
import com.church.conference.service.GroupRepository;

@RestController
public class GroupController {

	@Autowired
	GroupRepository groupService;
	
	@RequestMapping(value = "/allGroups")
	Iterable<Groups> findAll(){
		return groupService.findAll();
	}
}

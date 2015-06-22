package com.church.conference.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.conference.model.Groups;
import com.church.conference.service.GroupService;

@RestController
public class GroupController {

	@Autowired
	GroupService groupService;
	
	@RequestMapping(value = "/allGroups")
	List<Groups> findAll(){
		return groupService.findAll();
	}
}

package com.church.conference.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.church.conference.model.Groups;

public interface GroupService extends CrudRepository<Groups, Long> {
	Groups findById(long Id);
	List<Groups> findAll();
}

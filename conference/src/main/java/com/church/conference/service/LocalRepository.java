package com.church.conference.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.church.conference.model.Local;

public interface LocalRepository extends CrudRepository<Local, Long> {
	Local findById(long localId);
	List<Local> findAll();
}

package com.church.conference.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.church.conference.model.Local;

public interface LocalRepository extends CrudRepository<Local, Long> {
	Local findById(long localId);
	List<Local> findAll();
	List<Local> findByLevel(int level);
	List<Local> findByPlocalId(Long plocalId);
}

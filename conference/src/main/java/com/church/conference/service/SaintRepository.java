package com.church.conference.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.church.conference.model.Saint;

public interface SaintRepository extends CrudRepository<Saint, Long> {
	Saint findById(long saintId);
	List<Saint> findAll();
}

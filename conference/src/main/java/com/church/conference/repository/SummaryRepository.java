package com.church.conference.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.church.conference.model.Summary;

public interface SummaryRepository extends CrudRepository<Summary, Long> {
	Summary findById(long summaryId);
	List<Summary> findAll();
}

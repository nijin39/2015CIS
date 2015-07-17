package com.church.conference.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.church.conference.model.Saint;
import com.church.conference.model.Summary;

public interface SummaryRepository extends CrudRepository<Summary, Long> {
	Saint findById(long saintId);
	List<Summary> findAll();
	List<Summary> findByCountDate(Date countDate);
}

package com.church.conference.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.church.conference.model.Local;
import com.church.conference.model.Saint;

public interface SaintRepository extends CrudRepository<Saint, Long> {
	Saint findById(long saintId);
	List<Saint> findAll();
	List<Saint> findByLocal(Local local);
}

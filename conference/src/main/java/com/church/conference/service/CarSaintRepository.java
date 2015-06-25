package com.church.conference.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.church.conference.model.CarSaint;

public interface CarSaintRepository extends CrudRepository<CarSaint, Long> {
	CarSaint findById(long carSaintId);
	List<CarSaint> findAll();
}

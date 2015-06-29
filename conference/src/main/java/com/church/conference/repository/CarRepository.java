package com.church.conference.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.church.conference.model.Car;

public interface CarRepository extends CrudRepository<Car, Long> {
	Car findById(long carId);
	List<Car> findAll();
}

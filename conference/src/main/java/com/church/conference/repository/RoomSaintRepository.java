package com.church.conference.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.church.conference.model.RoomSaint;

public interface RoomSaintRepository extends CrudRepository<RoomSaint, Long> {
	RoomSaint findById(long roomSaintId);
	List<RoomSaint> findAll();
}

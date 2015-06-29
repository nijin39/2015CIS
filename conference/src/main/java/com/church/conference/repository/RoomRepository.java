package com.church.conference.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.church.conference.model.Room;

public interface RoomRepository extends CrudRepository<Room, Long> {
	Room findById(long roomId);
	List<Room> findAll();
}

package com.church.conference.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.church.conference.model.Groups;

public interface GroupRepository extends CrudRepository<Groups, Long> {
}

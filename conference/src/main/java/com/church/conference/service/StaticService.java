package com.church.conference.service;

import java.util.List;

import com.church.conference.model.Local;

public interface StaticService {
	public int countByLocal(Local local);
	public List<Local> findByAllLocal();
}

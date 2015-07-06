package com.church.conference.service;

import java.util.Map;

import com.church.conference.model.Local;

public interface StaticService {
	public int countByLocal(Local local);
	public Map<Local, Integer> countSaintByLocalLevel(int level);
}

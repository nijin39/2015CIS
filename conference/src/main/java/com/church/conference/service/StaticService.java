package com.church.conference.service;

import java.util.Date;
import java.util.Map;

import com.church.conference.model.Local;

public interface StaticService {
	public int countByLocal(Local local);
	public Map<Local, Integer> countSaintByLocalLevel(int level);
	public Map<Date, Integer> countSaintByDate(Date date);
}

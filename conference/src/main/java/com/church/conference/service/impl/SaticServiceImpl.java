package com.church.conference.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.church.conference.model.Local;
import com.church.conference.model.Saint;
import com.church.conference.repository.LocalRepository;
import com.church.conference.repository.SaintRepository;
import com.church.conference.service.StaticService;

@Service
public class SaticServiceImpl implements StaticService{
	@Autowired
	SaintRepository saintRepository;
	
	@Autowired
	LocalRepository localRepository;

	@Override
	public int countByLocal(Local local) {
		List<Saint> saints = saintRepository.findByLocal(local);
		return saints.size();
	}
	
	public List<Local> findByAllLocal(){
		return localRepository.findAll();
	}

}

package com.church.conference.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.church.conference.model.Local;
import com.church.conference.model.Saint;
import com.church.conference.repository.LocalRepository;
import com.church.conference.repository.SaintRepository;
import com.church.conference.service.StaticService;

@Service
public class SaticServiceImpl implements StaticService {
	@Autowired
	SaintRepository saintRepository;

	@Autowired
	LocalRepository localRepository;

	@Override
	public int countByLocal(Local local) {
		List<Saint> saints = saintRepository.findByLocal(local);
		return saints.size();
	}

	public List<Local> findByAllLocal() {
		return localRepository.findAll();
	}

	@Override
	public Map<Local, Integer> countSaintByLocalLevel(int level) {
		/*
		 * level 1 : Large Local level 2 : Middle Local levle 3 : Small Local
		 */

		Map<Local, Integer> countSaintByLocal = new HashMap<Local, Integer>();
		switch (level) {
		case 3:
			List<Local> localsLevel3 = localRepository.findByLevel(3);
			for (Local local : localsLevel3) {
				countSaintByLocal.put(local, local.getSaintList().size());
			}
			break;

		case 2:
			int countSaint = 0;
			List<Local> localsLevel2 = localRepository.findByLevel(2);
			for (Local local : localsLevel2) {
				List<Local> smallLocals = localRepository.findByPlocalId(local
						.getId());
				for (Local smallLocal : smallLocals) {
					countSaint = countSaint + smallLocal.getSaintList().size();
				}
				countSaintByLocal.put(local, countSaint);
			}
			break;

		case 1:
			int countSaintLevel1 = 0;
			List<Local> localsLevel1 = localRepository.findByLevel(1);
			for (Local local : localsLevel1) {
				List<Local> smallLocals = localRepository.findByPlocalId(local
						.getId());
				for (Local smallLocal : smallLocals) {
					countSaint = countSaintLevel1 + smallLocal.getSaintList().size();
				}
				countSaintByLocal.put(local, countSaintLevel1);
			}
			break;

		default:
			break;
		}
		return countSaintByLocal;
	}

}

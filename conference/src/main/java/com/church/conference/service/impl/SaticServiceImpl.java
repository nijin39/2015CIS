package com.church.conference.service.impl;

import java.util.Date;
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
		 * 각 레벨별 지역 성도들을 합계를 구함.
		 * 레벨은 총 3개로 고정되어 있음. 대지역 중지역 소지역 추후 지역 구분이 동적으로 늘어날 경우
		 * 재설계가 필요함.
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
			List<Local> locals = localRepository.findByLevel(2);
			for (Local local : locals) {
				List<Local> smallLocals = localRepository.findByPlocalId(local.getId());
				countSaint = getCountByLocalLevel(smallLocals);
				countSaintByLocal.put(local, countSaint);
			}
			break;

		case 1:
			int countSaintSmall = 0;
			int countSaintTemp = 0;
			List<Local> localsLevel1 = localRepository.findByLevel(1);
			for( Local localLevel1 : localsLevel1){
				List<Local> localLevel2 = localRepository.findByPlocalId(localLevel1.getId());
				for (Local local : localLevel2) {
					List<Local> smallLocals = localRepository.findByPlocalId(local.getId());
					countSaintSmall = getCountByLocalLevel(smallLocals);
				}
				countSaintTemp = countSaintTemp + countSaintSmall;
				countSaintByLocal.put(localLevel1, countSaintTemp);
				
			}
			break;

		default:
			break;
		}
		return countSaintByLocal;
	}

	@Override
	public Map<Date, Integer> countSaintByDate(Date date){
		
		return null;
	}
	
	private int getCountByLocalLevel(List<Local> locals) {
		int countSaint = 0;
		for (Local local : locals) {
			countSaint = countSaint + local.getSaintList().size();
		}
		return countSaint;
	}


}

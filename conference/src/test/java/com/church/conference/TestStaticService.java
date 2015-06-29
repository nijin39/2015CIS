package com.church.conference;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.church.conference.model.Local;
import com.church.conference.repository.LocalRepository;
import com.church.conference.service.StaticService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class TestStaticService {

	@Autowired
	StaticService staticService;
	@Autowired
	LocalRepository localRepository;
	
	@Test
	public void testFindAll() throws Exception{
		Local local = localRepository.findById(4);
		int countByLocal = staticService.countByLocal(local);
		assertEquals(countByLocal,4);
	}
}

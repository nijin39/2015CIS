package com.church.conference;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.church.conference.model.Local;
import com.church.conference.service.LocalRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class TestLocalRepository {

	@Autowired
	LocalRepository localRepository;
	
	@Test
	public void testFindAll() throws Exception{
		List<Local> localList = localRepository.findAll();
		assertEquals(localList.size(),3);
	}
}

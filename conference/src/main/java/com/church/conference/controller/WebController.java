package com.church.conference.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.church.conference.vo.Message;

@Controller
@RequestMapping("/web")
public class WebController {
	@RequestMapping
	public ModelAndView list() {
		List<Message> messages = new ArrayList<Message>();
		Message message1 = new Message();
		message1.setId(1L);
		message1.setName("Kim JongIL");
		
		Message message2 = new Message();
		message2.setId(2L);
		message2.setName("Kimg Dong LI");
		
		messages.add(message1);
		messages.add(message2);
		
		return new ModelAndView("messages/list", "messages", messages);
	}
}

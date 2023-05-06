package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.User;
import com.demo.service.RegistrationService;

@Controller
public class RegistrationController {

	@RequestMapping(value ="/register", method=RequestMethod.POST)
	public String register(@ModelAttribute User user)
	{
		System.out.println(user.getAddress());
		RegistrationService r1=new RegistrationService();
		if(r1.register(user))
			return "success";
		else
			return "index";
					
	}
	
}

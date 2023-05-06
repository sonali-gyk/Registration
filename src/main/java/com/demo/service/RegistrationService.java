package com.demo.service;

import com.demo.controller.Dao.RegistrationDao;
import com.demo.model.User;

public class RegistrationService {

public boolean  register(User user)
{
	RegistrationDao d1=new RegistrationDao();
			System.out.println("service");

		if(d1.add(user))
			return true;
		return false;
		
	
	
}
}

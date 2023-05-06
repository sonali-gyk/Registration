package com.demo.controller.Dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.model.User;

public class RegistrationDao {

	public boolean add(User user)  {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","sonali");
		PreparedStatement pr=con.prepareStatement("insert into user(firstname,lastname,middlename,course,countrycode,phone,email,psw,pswrepeat,address)values(?,?,?,?,?,?,?,?,?,?)");
		
		//pr.setLong(1, user.getId());
		pr.setString(1, user.getFirstname());
		pr.setString(2, user.getLastname());
		pr.setString(3, user.getMiddlename());
		
		System.out.println(user);
		
		pr.setString(4, user.getCourse());
		pr.setString(5, user.getCountrycode());
		pr.setLong(6, user.getPhone());
		pr.setString(7, user.getEmail());
		pr.setString(8, user.getPsw());
		pr.setString(9, user.getPswrepeat());
		pr.setString(10, user.getAddress());
		System.out.println("Dao");
	//boolean b=	pr.execute();
	//System.out.println(b);
		
		if(1==pr.executeUpdate())
		
		return true;
		}
		
		catch(Exception e)
		{
			e.getMessage();
		}
		return false;
		
	}
}

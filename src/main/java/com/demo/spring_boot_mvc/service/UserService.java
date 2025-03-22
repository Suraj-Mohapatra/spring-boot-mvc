package com.demo.spring_boot_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.spring_boot_mvc.dao.UserDao;

@Component
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public String addUser(String name, int age, String gender) {
		int rowsInserted = userDao.insertUser(name, age, gender);
		if (rowsInserted > 0) {
			return "successful";
		} else {
			return "Unsuccessful";
		}

	}

}

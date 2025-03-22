package com.demo.spring_boot_mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insertUser(String name, int age, String gender) {

		String query = "INSERT INTO DUMMY_USER (NAME, AGE, GENDER) VALUES (?, ?, ?)";
		int rowsInserted = 0;
		try {
			rowsInserted = jdbcTemplate.update(query, name, age, gender);
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		return rowsInserted;

	}

}

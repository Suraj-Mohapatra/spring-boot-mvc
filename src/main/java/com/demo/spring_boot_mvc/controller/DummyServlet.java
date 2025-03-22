package com.demo.spring_boot_mvc.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "DummyServlet", urlPatterns = { "/dummy" })
public class DummyServlet extends HttpServlet {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = "Alice";
		int age = 28;
		String gender = "Female";
		
		String sql = "INSERT INTO DUMMY (NAME, AGE, GENDER) VALUES (?, ?, ?)";
		int rowsInserted = jdbcTemplate.update(sql, name, age, gender);

		if (rowsInserted > 0) {
			System.out.println("Record inserted successfully!");
		} else {
			System.out.println("Failed to insert record.");
		}

	}

}

package com.demo.spring_boot_mvc.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.spring_boot_mvc.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "DummyServlet", urlPatterns = { "/dummy" })
public class DummyServlet extends HttpServlet {

	@Autowired
	private UserService service;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = service.addUser("Suraj", 29, "M");
		try (var writer = response.getWriter()) {
			writer.println(message+" "+System.currentTimeMillis());
		}

	}

}

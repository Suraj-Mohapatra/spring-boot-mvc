package com.demo.spring_boot_mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

	@GetMapping("/getSessionId")
	public String sayHello(HttpServletRequest request) {
		return request.getSession(false).getId();
	}

}
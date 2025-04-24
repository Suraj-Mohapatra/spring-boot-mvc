package com.uglyeagle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

	@GetMapping("/getSessionId")
	public String sayHello(HttpServletRequest request) {
		if(request.getSession(false) != null && request.getSession(false).getAttribute("u_name") != null) {
			return request.getSession(false).getId();
		}else {
			return "session does not exist";

		}
	}

}
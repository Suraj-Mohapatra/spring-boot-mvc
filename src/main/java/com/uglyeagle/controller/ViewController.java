package com.uglyeagle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ViewController {

	private static boolean hasUserSession(HttpServletRequest request) {
		return request.getSession(false) != null && request.getSession(false).getAttribute("u_name") != null;
	}

	@RequestMapping({ "/", "/home" })
	public String home() {
		return "home";
	}

	@RequestMapping({ "/welcome" })
	public String logIn(HttpServletRequest request) {
		return hasUserSession(request) ? "welcome" : "login_err";
	}

	@RequestMapping({ "/loginerr" })
	public String loginErr(HttpServletRequest request) {
		return "login_err";
	}
	
	@RequestMapping({ "/score" })
	public String score() {
		return "livescore";
	}
	

	@RequestMapping({ "/reactdemo" })
	public String reactDemo() {
		return "reactpage/reactdemo";
	}
	

}

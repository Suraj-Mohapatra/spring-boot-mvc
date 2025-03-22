package com.demo.spring_boot_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	@RequestMapping({"/","/home"})
	public String home() {
		System.out.println("Hello sdfgfdg");
		return "home";
	}
	
}

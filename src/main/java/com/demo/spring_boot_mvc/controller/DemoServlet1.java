package com.demo.spring_boot_mvc.controller;

import static com.demo.spring_boot_mvc.ansiescapecode.AnsiColour.BLACK_FG;
import static com.demo.spring_boot_mvc.ansiescapecode.AnsiColour.CYAN_BG;
import static com.demo.spring_boot_mvc.ansiescapecode.AnsiColour.RESET;
import static com.demo.spring_boot_mvc.ansiescapecode.AnsiColour.YELLOW_BG;
import static com.demo.spring_boot_mvc.ansiescapecode.AnsiColour.colourPair;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "DemoServlet1", urlPatterns = { "/Demo1", "/loo" })
public class DemoServlet1 extends HttpServlet {

	static {
		System.out.println(colourPair(BLACK_FG, YELLOW_BG) + "DemoServlet1 loaded 2 JVM" + RESET);
	}

	public DemoServlet1() {
		System.out.println(colourPair(BLACK_FG, CYAN_BG) + "DemoServlet1 instantiated" + RESET);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getMethod() + " method executed");
		try (PrintWriter writer = response.getWriter()) {
			writer.println("Hi! I am Goku the Saiyan God speaking ok");
			writer.println("Time in millisec is : " + System.currentTimeMillis());
			writer.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss")));
			writer.println("--------------------------------");
		}

		HttpSession session = request.getSession(false);
		session.setAttribute("name", "Goku");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getMethod() + " method executed");
		// response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("Hi! I am Goku the Saiyan God speaking ok");
		writer.println("Time in millisec is : " + System.currentTimeMillis());
		writer.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss")));
	}
}

package com.uglyeagle.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = { "/Login", "/Signin" })
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		if ("admin".equals(userName) && "admin".equals(password)) {
			HttpSession session = request.getSession(true);
			session.setAttribute("u_name", userName);
			response.sendRedirect("./welcome");
		} else if ("".equals(userName) || "".equals(password)) {
			response.sendRedirect("./");
		} else {
			response.sendRedirect("./loginerr");
		}

	}

}

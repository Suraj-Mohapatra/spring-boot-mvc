package com.uglyeagle.controller;

import static com.uglyeagle.ansiescapecode.AnsiColour.BLACK_FG;
import static com.uglyeagle.ansiescapecode.AnsiColour.CYAN_BG;
import static com.uglyeagle.ansiescapecode.AnsiColour.RESET;
import static com.uglyeagle.ansiescapecode.AnsiColour.YELLOW_BG;
import static com.uglyeagle.ansiescapecode.AnsiColour.colourPair;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "DemoServlet2", urlPatterns = {"/Demo2"})
public class DemoServlet2 extends HttpServlet {
	
	static {
    	System.out.println(colourPair(BLACK_FG, YELLOW_BG)+"DemoServlet2 loaded 2 JVM"+RESET);
    }
	
	public DemoServlet2() {
		System.out.println(colourPair(BLACK_FG,CYAN_BG)+"DemoServlet2 instantiated"+RESET);
	}
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().println("Hi! I am Vegeta also the Saiyan God");
        response.getWriter().println("Time in millisec is : "+System.currentTimeMillis());
        response.getWriter().println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss")));
		
    }
    
}


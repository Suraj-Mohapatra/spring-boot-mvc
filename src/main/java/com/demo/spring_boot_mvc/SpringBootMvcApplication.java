package com.demo.spring_boot_mvc;

import static com.demo.spring_boot_mvc.ansiescapecode.AnsiColour.GREEN_FG;
import static com.demo.spring_boot_mvc.ansiescapecode.AnsiColour.RESET;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@ServletComponentScan
public class SpringBootMvcApplication {

	public static void main(String[] args) {
		ApplicationContext springApplicationContext;
		springApplicationContext = SpringApplication.run(SpringBootMvcApplication.class, args);
		System.out.println(GREEN_FG + springApplicationContext.getId() + " " + "started at http://localhost:8080"
				+ springApplicationContext.getApplicationName() + RESET);
		
	}

}

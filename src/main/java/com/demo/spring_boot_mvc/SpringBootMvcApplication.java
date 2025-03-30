package com.demo.spring_boot_mvc;

import static com.demo.spring_boot_mvc.ansiescapecode.AnsiColour.GREEN_FG;
import static com.demo.spring_boot_mvc.ansiescapecode.AnsiColour.RESET;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ServletComponentScan
@EnableScheduling
public class SpringBootMvcApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringBootMvcApplication.class);

	public static void main(String[] args) throws Exception {
		ApplicationContext springApplicationContext;
		springApplicationContext = SpringApplication.run(SpringBootMvcApplication.class, args);
		logger.info(GREEN_FG + springApplicationContext.getId() + " " + "started at http://localhost:8080"
				+ springApplicationContext.getApplicationName() + RESET);
	}

}

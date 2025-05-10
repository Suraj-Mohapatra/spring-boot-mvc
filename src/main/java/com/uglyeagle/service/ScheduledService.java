package com.uglyeagle.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledService {
	
	//@Async
	@Scheduled(fixedRate = 5000) // it will start the task after 5 seconds of the previous task started
	public void cleanTeampFile() {
		//System.out.println("inside cleanTempFile  : "+Thread.currentThread().getName());
		
	}
	

	@Scheduled(fixedDelay=1000) // it will wait for 1 second after the completion of the previous task
	public void cleanLog() {
		//System.out.println("inside cleanLog : "+Thread.currentThread().getName());
	
	}

	@Scheduled(cron = "0 0 13 * * SAT,SUN") // it will execute every Saturday and Sunday at 1 PM
	public void weeklyReport() {
		//System.out.println("inside weeklyReport  : "+Thread.currentThread().getName());
	}

}

package com.demo.spring_boot_mvc.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.demo.spring_boot_mvc.socket.LiveScoreSocket;

@Component
public class LiveScoreService {
	
    @Scheduled(fixedRate = 5000)
    public void getLiveScore() {
    	LiveScoreSocket.updateScore();
    }
    
}

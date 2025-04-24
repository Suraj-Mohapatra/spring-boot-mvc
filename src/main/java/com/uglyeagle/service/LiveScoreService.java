package com.uglyeagle.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.uglyeagle.socket.LiveScoreSocket;

@Component
public class LiveScoreService {
	
    @Scheduled(fixedRate = 5000)
    public void getLiveScore() {
    	LiveScoreSocket.updateScore();
    }
    
}

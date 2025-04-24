package com.uglyeagle.socket;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/cricketScore")
public class LiveScoreSocket {

	private static final Set<Session> sessions = new CopyOnWriteArraySet<>();

	private static int score = 100;

	@OnOpen
	public void onOpen(Session session) {
		sessions.add(session); // on 1st connection adds user session to a session set
		sendScore("Live Score: " + score, session); // sends the current score
	}

	private static void sendScore(String message, Session session) {
		try {
			
			session.getBasicRemote().sendText(message);
			
		} catch (IllegalArgumentException i) {
			i.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void broadcastLiveScore(String message) {
		for (Session session : sessions) {
			sendScore(message, session );
		}
	}

	@OnClose
	public void onClose(Session session) {
		sessions.remove(session);
	}

	public static void updateScore() {
		
		score += (int) (Math.random() * 10);
		System.out.println("updated score : " + score);
		broadcastLiveScore("Live Score: " + score);
	}

}

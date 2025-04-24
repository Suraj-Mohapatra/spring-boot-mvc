package com.uglyeagle.socket.socketconfig;

import com.uglyeagle.socket.LiveScoreSocket;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.websocket.server.ServerContainer;
import jakarta.websocket.server.ServerEndpointConfig;

@WebListener
public class WebSocketConfig implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        try {
            ServerContainer container = 
                (ServerContainer) event.getServletContext().getAttribute("jakarta.websocket.server.ServerContainer");

            if (container == null) {
                throw new IllegalStateException("WebSocket ServerContainer not found!");
            }

            ServerEndpointConfig config = ServerEndpointConfig.Builder
                .create(LiveScoreSocket.class, "/cricketScore")
                .build();

            container.addEndpoint(config);

            System.out.println("WebSocket registered: /cricketScore");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("WebSocket registration failed!", e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // No cleanup needed
    }
}

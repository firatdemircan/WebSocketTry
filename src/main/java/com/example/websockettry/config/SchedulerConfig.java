package com.example.websockettry.config;

import com.example.websockettry.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class SchedulerConfig {

    @Autowired
    SimpMessagingTemplate template;

    @Scheduled(fixedDelay = 3000)
    public void sendAdhocMessages() {
        System.out.println("mmmmm");
        template.convertAndSend("/topic/app", new UserResponse("Fixed Delay Scheduler"));
    }
}

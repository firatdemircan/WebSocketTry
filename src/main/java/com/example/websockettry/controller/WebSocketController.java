package com.example.websockettry.controller;

/*
    CreatedBy pureevill
    CreatedDate 28.09.2022
    CreatedFor PaymentHavaleProject
*/

import com.example.websockettry.model.User;
import com.example.websockettry.model.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class WebSocketController {


    // Handles messages from /app/chat. (Note the Spring adds the /app prefix for us).
    @MessageMapping("/user")
    @SendTo("/topic/app")
    public String getUser(String myMessage) {

        return myMessage;
    }


}

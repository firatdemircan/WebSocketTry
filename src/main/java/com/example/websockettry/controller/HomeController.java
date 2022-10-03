package com.example.websockettry.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RequestMapping("/appHavale")
public class HomeController {

    private final SimpMessagingTemplate template;


    @RequestMapping("/")
    public String home()
    {
        return "redirect:/swagger-ui/";
    }

    @GetMapping("/asd/{mystr}")
    public String xx(@PathVariable String mystr){
        template.convertAndSend("/topic/app",mystr);
        int x=2;
        return "Merhaba";
    }

}

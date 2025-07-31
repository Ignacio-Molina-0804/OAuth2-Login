package dev.oauth2.social_login.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Social Login Application!";
    }

    @GetMapping("/secured")
    public String secured(){

        return "Hello Secured";

    }
    
}

package main.java.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GithubEventController {

    @RequestMapping("/")
    public String index() {
        return "I am your master!";
    }

}


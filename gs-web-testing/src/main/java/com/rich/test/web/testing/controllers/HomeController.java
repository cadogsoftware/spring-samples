package com.rich.test.web.testing.controllers;

import com.rich.test.web.testing.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    private final GreetingService greetingService;

    public HomeController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping("/") // Adds all GET, POST etc mappings by default
    public @ResponseBody String greeting() {
        return greetingService.greet();
    }



}

package com.almousleck.security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testing(HttpServletRequest request) {
        return "Hello World! " + request.getSession().getId();
    }
}

package com.mav.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home() {
        return "Welcome All";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome Admin";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome User";
    }
}

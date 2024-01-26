package com.example.restapimongodbtutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantController {
    @GetMapping(path = "/merchants")
    public String getMerchantList() {
        return "Merchant List";
    }
}

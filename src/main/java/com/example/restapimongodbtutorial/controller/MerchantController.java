package com.example.restapimongodbtutorial.controller;

import com.example.restapimongodbtutorial.model.pojo.Merchant;
import com.example.restapimongodbtutorial.service.MerchantService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MerchantController {

    private final MerchantService merchantService;

    @GetMapping("/merchants")
    public List<Merchant> findAll() {
        return merchantService.findAll();
    }
}

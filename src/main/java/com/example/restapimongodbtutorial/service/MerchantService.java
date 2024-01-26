package com.example.restapimongodbtutorial.service;

import com.example.restapimongodbtutorial.model.pojo.Merchant;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MerchantService {
    List<Merchant> findAll();
}

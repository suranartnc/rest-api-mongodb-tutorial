package com.example.restapimongodbtutorial.service;

import com.example.restapimongodbtutorial.model.pojo.Merchant;
import com.example.restapimongodbtutorial.repository.MerchantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MerchantService {
    private final MerchantRepository merchantRepository;

    public List<Merchant> findAll() {
        return merchantRepository.findAll();
    }
}

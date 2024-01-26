package com.example.restapimongodbtutorial.service;

import com.example.restapimongodbtutorial.model.pojo.Merchant;
import com.example.restapimongodbtutorial.repository.MerchantRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class MerchantServiceImpl implements MerchantService {
    private final MerchantRepository merchantRepository;

    public List<Merchant> findAll() {
        return merchantRepository.findAll();
    }
}

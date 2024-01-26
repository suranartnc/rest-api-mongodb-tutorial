package com.example.restapimongodbtutorial.repository;

import com.example.restapimongodbtutorial.model.pojo.Merchant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MerchantRepository extends MongoRepository<Merchant, String> {
}

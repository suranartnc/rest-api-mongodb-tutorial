package com.example.restapimongodbtutorial.model.pojo;

import com.example.restapimongodbtutorial.model.enumeration.MerchantType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@Builder
public class Merchant {
    @Id
    private String id;

    private String name;

    private MerchantType merchantType;
}




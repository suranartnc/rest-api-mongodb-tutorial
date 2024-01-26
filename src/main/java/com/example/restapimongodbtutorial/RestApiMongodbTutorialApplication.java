package com.example.restapimongodbtutorial;

import com.example.restapimongodbtutorial.model.pojo.Merchant;
import com.example.restapimongodbtutorial.repository.MerchantRepository;
import com.example.restapimongodbtutorial.model.enumeration.MerchantType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApiMongodbTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiMongodbTutorialApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(MerchantRepository merchantRepository) {
		return args-> {
			Merchant merchant = Merchant.builder()
					.name("Starbucks")
					.merchantType(MerchantType.QR)
					.build();
			merchantRepository.insert(merchant);
		};
	}

}

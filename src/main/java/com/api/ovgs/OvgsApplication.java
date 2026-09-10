package com.api.ovgs;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.ovgs.entity.Client;
import com.api.ovgs.repository.ClientRepository;

@SpringBootApplication
public class OvgsApplication  implements CommandLineRunner {	// teste do banco de dados H2

	// teste do banco de dados H2
	private final ClientRepository clientRepository;
	OvgsApplication(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}	

	public static void main(String[] args) {
		SpringApplication.run(OvgsApplication.class, args);
	}

	@Override 	// teste do banco de dados H2

	public void run(String... args) throws Exception {
		Client c1 = new Client(null, "Caio Vilarouca", "caiodocs", "caio@email.com", true);
		Client c2 = new Client(null, "Tongas Felix", "tongasdocs", "tongas@email.com", false);

		clientRepository.saveAll(Arrays.asList(c1,c2));
	}
	
	
}

package com.meudominio.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.meudominio.api.utils.SenhaUtils;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class MeuPrimeiroProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
		
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha Ecoded: " +senhaEncoded);
			
			senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha encoded novamente: " + senhaEncoded);
			
			System.out.println("senha válida: " + SenhaUtils.senhaValida("123456", senhaEncoded));
			
		};
		
	}
	
	

}

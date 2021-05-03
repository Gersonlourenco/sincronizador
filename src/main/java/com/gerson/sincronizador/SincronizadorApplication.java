package com.gerson.sincronizador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gerson.sincronizador.reaceitaService.ReceitaService;

@SpringBootApplication
public class SincronizadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SincronizadorApplication.class, args);
		System.out.println("teste");
		
		 // Exemplo como chamar o "serviço" do Banco Central.
        ReceitaService receitaService = new ReceitaService();
        try {
			receitaService.atualizarConta("0101", "123456", 100.50, "A");
		} catch (RuntimeException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}

}

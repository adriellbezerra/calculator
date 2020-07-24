package com.adriell.calculator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adriell.calculator.domain.Juros;
import com.adriell.calculator.domain.Simples;
import com.adriell.calculator.services.ConverteTaxaService;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		testeConversao();
	}
	
	public void testeConversao() {
		Juros simples1 = new Simples(0.0, 0, 9, "a.m", 0, "m");

		System.out.println(simples1.toString());

		double mesEmAno = ConverteTaxaService.mesDia(simples1.getTax());

		simples1.setTax(mesEmAno);
		simples1.setFormatoTax("a.d");

		System.out.println(simples1.toString());
	}

}

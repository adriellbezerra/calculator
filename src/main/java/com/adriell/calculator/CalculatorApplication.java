package com.adriell.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adriell.calculator.domain.Juros;
import com.adriell.calculator.domain.Simples;
import com.adriell.calculator.services.ConverteTempoService;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner{

	@Autowired
	private ConverteTempoService converteTempoService;

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		testeConversao();
	}
	
	public void testeConversao() {
		Juros simples1 = new Simples(0.0, 0, 0.1, "a.d", 0, "m");

		System.out.println(simples1.toString());

		double mesEmAno = converteTempoService.diaMes(simples1.getTax());

		simples1.setTax(mesEmAno);
		simples1.setFormatoTax("a.m");

		System.out.println(simples1.toString());
	}

}

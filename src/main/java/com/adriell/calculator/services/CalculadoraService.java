package com.adriell.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

	public double calculaMontante(double capital, double juros) {
		return juros + capital;
	}
	
	public double calculaMontante(double capital, double juros, double taxa, double tempo) {
		return capital * (1 + taxa * tempo);
	}
	
	public double calculaJuros (double capital, double taxa, double tempo) {
		return capital * taxa * tempo;
	}
	
}

package com.adriell.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class ConverteTempoService {

	public double diaMes(double valorAD) {
		return valorAD * 12;
	}
	
	public double diaBimestre(double valorAD) {
		return valorAD * (12*2);
	}
	
	public double diaTrimestre(double valorAD) {
		return valorAD * (12*3);
	}
	
	public double diaSemestre(double valorAD) {
		return valorAD * (12*6);
	}
	
	public double diaAno(double valorAD) {
		return valorAD * (12*12);
	}
	
	public double mesDia(double valorAM) {
		return valorAM/30;
	}
	
	public double mesBimestre(double valorAM) {
		return valorAM * 2;
	}
	
	public double mesTrimestre(double valorAM) {
		return valorAM * 3;
	}
	
	public double mesSemestre(double valorAM) {
		return valorAM * 6;
	}
	
	public double mesAno(double valorAM) {
		return valorAM * 12;
	}
	
	public double bimestreDia(double valorAB) {
		return valorAB/(30*2);
	}
	
	public double bimestreMes(double valorAB) {
		return valorAB/(2);
	}
	
	public double bimestreTri(double valorAB) {
		return bimestreMes(valorAB) * 3;
	}
	
	public double bimestreSemestre(double valorAB) {
		return bimestreMes(valorAB) * 6;
	}
	
	public double bimestreAno(double valorAB) {
		return bimestreMes(valorAB) * 12;
	}
}

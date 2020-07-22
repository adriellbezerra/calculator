package com.adriell.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class ConverteTempoService {

	public double diaMes(double valorAD) {
		return valorAD * 30;
	}
	
	public double diaBimestre(double valorAD) {
		return valorAD * (30*2);
	}
	
	public double diaTrimestre(double valorAD) {
		return valorAD * (30*3);
	}
	
	public double diaSemestre(double valorAD) {
		return valorAD * (30*6);
	}
	
	public double diaAno(double valorAD) {
		return valorAD * (30*12);
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
	
	public double trimestreDia(double valorAT) {
		return valorAT/(30*3);
	}
	
	public double trimestreMes(double valorAT) {
		return valorAT/3;
	}
	
	public double trimestreBimestre(double valorAT) {
		return trimestreMes(valorAT) * 2;
	}
	
	public double trimestreSemestre(double valorAT) {
		return valorAT * 2;
	}
	
	public double trimestreAno(double valorAT) {
		return valorAT * 4;
	}
	
	public double semestreDia(double valorAS) {
		return valorAS/(30*6);
	}
	
	public double semestreMes(double valorAS) {
		return valorAS/6;
	}
	
	public double semestreBimestre(double valorAS) {
		return valorAS/3;
	}
	
	public double semestreTrimestre(double valorAS) {
		return valorAS/2;
	}
	
	public double semestreAno(double valorAS) {
		return valorAS * 2;
	}
	
	public double anoDia(double valorAA) {
		return valorAA/(30 * 12);
	}
	
	public double anoMes(double valorAA) {
		return valorAA/12;
	}
	
	public double anoBimestre(double valorAA) {
		return valorAA/6;
	}
	
	public double anoTrimestre(double valorAA) {
		return valorAA/4;
	}
	
	public double anoSemestre(double valorAA) {
		return valorAA/2;
	}
}

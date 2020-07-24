package com.adriell.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class ConverteTaxaService {

	public static double diaMes(double valorAD) {
		return valorAD * 30;
	}
	
	public static double diaBimestre(double valorAD) {
		return valorAD * (30*2);
	}
	
	public static double diaTrimestre(double valorAD) {
		return valorAD * (30*3);
	}
	
	public static double diaSemestre(double valorAD) {
		return valorAD * (30*6);
	}
	
	public static double diaAno(double valorAD) {
		return valorAD * (30*12);
	}
	
	public static double mesDia(double valorAM) {
		return valorAM/30;
	}
	
	public static double mesBimestre(double valorAM) {
		return valorAM * 2;
	}
	
	public static double mesTrimestre(double valorAM) {
		return valorAM * 3;
	}
	
	public static double mesSemestre(double valorAM) {
		return valorAM * 6;
	}
	
	public static double mesAno(double valorAM) {
		return valorAM * 12;
	}
	
	public static double bimestreDia(double valorAB) {
		return valorAB/(30*2);
	}
	
	public static double bimestreMes(double valorAB) {
		return valorAB/(2);
	}
	
	public static double bimestreTri(double valorAB) {
		return bimestreMes(valorAB) * 3;
	}
	
	public static double bimestreSemestre(double valorAB) {
		return bimestreMes(valorAB) * 6;
	}
	
	public static double bimestreAno(double valorAB) {
		return bimestreMes(valorAB) * 12;
	}
	
	public static double trimestreDia(double valorAT) {
		return valorAT/(30*3);
	}
	
	public static double trimestreMes(double valorAT) {
		return valorAT/3;
	}
	
	public static double trimestreBimestre(double valorAT) {
		return trimestreMes(valorAT) * 2;
	}
	
	public static double trimestreSemestre(double valorAT) {
		return valorAT * 2;
	}
	
	public static double trimestreAno(double valorAT) {
		return valorAT * 4;
	}
	
	public static double semestreDia(double valorAS) {
		return valorAS/(30*6);
	}
	
	public static double semestreMes(double valorAS) {
		return valorAS/6;
	}
	
	public static double semestreBimestre(double valorAS) {
		return valorAS/3;
	}
	
	public static double semestreTrimestre(double valorAS) {
		return valorAS/2;
	}
	
	public static double semestreAno(double valorAS) {
		return valorAS * 2;
	}
	
	public static double anoDia(double valorAA) {
		return valorAA/(30 * 12);
	}
	
	public static double anoMes(double valorAA) {
		return valorAA/12;
	}
	
	public static double anoBimestre(double valorAA) {
		return valorAA/6;
	}
	
	public static double anoTrimestre(double valorAA) {
		return valorAA/4;
	}
	
	public static double anoSemestre(double valorAA) {
		return valorAA/2;
	}
}

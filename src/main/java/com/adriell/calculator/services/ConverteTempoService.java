package com.adriell.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class ConverteTempoService {

	public static double diaMes(double dias) {
		return dias/30.0;
	}
	
	public static double diaBimestre(double dias) {
		return dias/60.0;
	}
	
	public static double diaTrimestre(double dias) {
		return dias/90.0;
	}
	
	public static double diaSemestre(double dias) {
		return dias/180.0;
	}
	
	public static double diaAno(double dias) {
		return dias/360.0;
	}
	
	public static double mesDia(double meses) {
		return meses * 30.0;
	}
	
	public static double mesBimestre(double meses) {
		return meses/2.0;
	}
	
	public static double mesTrimestre(double meses) {
		return meses/3.0;
	}
	
	public static double mesSemestre(double meses) {
		return meses/6.0;
	}
	
	public static double mesAno(double meses) {
		return meses/12.0;
	}
	
	public static double bimestreDia(double bimestres) {
		return bimestres * 60.0;
	}
	
	public static double bimestreMes(double bimestres) {
		return bimestres * 2.0;
	}
	
	public static double bimestreTrimestre(double bimestres) {
		return mesTrimestre(bimestreMes(bimestres));
	}
	
	public static double bimestreSemestre(double bimestres) {
		return mesSemestre(bimestreMes(bimestres));
	}
	
	public static double bimestreAno(double bimestres) {
		return mesAno(bimestreMes(bimestres));
	}
	
	public static double trimestreDia(double trimestres) {
		return trimestres * 90.0;
	}
	
	public static double trimestreMes(double trimestres) {
		return trimestres * 3.0;
	}
	
	public static double trimestreBimestre(double trimestres) {
		return mesBimestre(trimestreMes(trimestres));
	}
	
	public static double trimestreSemestre(double trimestres) {
		return mesSemestre(trimestreMes(trimestres));
	}
	
	public static double trimestreAno(double trimestres) {
		return mesAno(trimestreMes(trimestres));
	}
	
	public static double semestreDia(double semestres) {
		return semestres * 180.0;
	}
	
	public static double semestreMes(double semestres) {
		return semestres * 6.0;
	}
	
	public static double semestreBimestre(double semestres) {
		return semestres * 3.0;
	}
	
	public static double semestreTrimestre(double semestres) {
		return semestres * 2.0;
	}
	
	public static double semestreAno(double semestres) {
		return mesAno(semestreMes(semestres));
	}
	
	public static double anoDia(double anos) {
		return anos * 360;
	}
	
	public static double anoMes(double anos) {
		return anos * 12;
	}
	
	public static double anoBimestre(double anos) {
		return anos * 6;
	}
	
	public static double anoTrimestre(double anos) {
		return anos * 4;
	}
	
	public static double anoSemestre(double anos) {
		return anos * 2;
	}
	
}

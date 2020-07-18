package com.adriell.calculator.domain;

import java.io.Serializable;

public class Simple implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private double cap;
	private double jur;
	private double tax;
	private String formatoTax;
	private double tem;
	private String formatoTem;
	
	
	public Simple() {
		// TODO Auto-generated constructor stub
	}
	
	public Simple(double cap, double jur, double tax, 
			String formatoTax, double tem, String formatoTem) {
		super();
		this.cap = cap;
		this.jur = jur;
		this.tax = tax;
		this.formatoTax = formatoTax;
		this.tem = tem;
		this.formatoTem = formatoTem;
	}
	public double getCap() {
		return cap;
	}
	public void setCap(double cap) {
		this.cap = cap;
	}
	public double getJur() {
		return jur;
	}
	public void setJur(double jur) {
		this.jur = jur;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTem() {
		return tem;
	}
	public void setTem(double tem) {
		this.tem = tem;
	}
	
	public String getFormatoTax() {
		return formatoTax;
	}

	public void setFormatoTax(String formatoTax) {
		this.formatoTax = formatoTax;
	}

	public String getFormatoTem() {
		return formatoTem;
	}

	public void setFormatoTem(String formatoTem) {
		this.formatoTem = formatoTem;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Juros Simples:\n");
		builder.append("Capital: " + cap + ", ");
		builder.append("Juros: " + jur + ", ");
		builder.append("Taxa: " + tax + " " + formatoTax + ", ");
		builder.append("Tempo: " + tem + " " + formatoTem);
		
		return builder.toString();
	}
	
}

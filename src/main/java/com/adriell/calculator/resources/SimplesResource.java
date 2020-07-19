package com.adriell.calculator.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adriell.calculator.domain.Juros;
import com.adriell.calculator.domain.Simples;

@RestController
@RequestMapping(value="/simples")
public class SimplesResource {

	@RequestMapping(method = RequestMethod.GET)
	public Simples descricao() {

		Juros simples1 = new Simples(2800.00, 300, 35, "a.a.", 8, "a.m.");
		
		return (Simples) simples1;
		
	}
}

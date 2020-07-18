package com.adriell.calculator.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adriell.calculator.domain.Simple;

@RestController
@RequestMapping(value="/simple")
public class SimpleResource {

	@RequestMapping(method = RequestMethod.GET)
	public Simple descricao() {

		Simple simples1 = new Simple(2490.00, 498.00, 30, "a.a.", 8, "a.m.");
		
		return simples1;
		
	}
}

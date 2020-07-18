package com.adriell.calculator.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/simple")
public class SimpleResource {

	@RequestMapping(method = RequestMethod.GET)
	public String calcularJ() {
		return "Rest está funcionando";
	}
}

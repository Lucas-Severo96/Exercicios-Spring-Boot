package br.com.cod3r.exerciciosspringb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {
	

	@GetMapping(path = "/somar/{numero1}/{numero2}")
	public double somarNumeros(@PathVariable double numero1, @PathVariable double numero2) {
		return numero1 +  numero2;
		
	}
	
	@GetMapping(path = "/subtrair")
	public double subtrairNumeros(
			@RequestParam (name ="a") double numero1, 
			@RequestParam (name ="b") double numero2) {
		return numero1 -  numero2;
		
	}
}

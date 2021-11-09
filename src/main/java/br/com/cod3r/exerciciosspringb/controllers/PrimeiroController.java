package br.com.cod3r.exerciciosspringb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@GetMapping 
	public String ola() {
		return "Olá Spring Boot!";
	}
}

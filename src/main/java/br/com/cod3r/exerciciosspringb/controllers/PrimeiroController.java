package br.com.cod3r.exerciciosspringb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@GetMapping(path= {"ola", "/saudacao"})
	public String ola() {
		return "Olá Spring Boot!";
	}
	
	//Ambiguidade entre Métodos HTTP
	@GetMapping(path= "/saudacao")
	public String saudacao() {
		return "Olá Spring Boot!";
	}
}

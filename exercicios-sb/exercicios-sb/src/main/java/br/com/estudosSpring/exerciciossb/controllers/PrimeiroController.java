package br.com.estudosSpring.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // configurando Spring para dizer que essa classe é controladora
public class PrimeiroController {

	@GetMapping(path = { "ola", "saudacao" })//anotacao que solicita o metodo 
	public String ola() {
		return "Ola Spring boot";
	}

//	@GetMapping(path = "saudacao")//não consigo usar url ja nomeadas, pois vai indicar erro de ambiguidade
//	public String saudacao() {
//		return "Ola Spring boot";
//	}
	
	@PostMapping(path = "saudacao")
	public String saudacao() {
		return "Ola Spring boot (POST)";
	}
	
	
	
}

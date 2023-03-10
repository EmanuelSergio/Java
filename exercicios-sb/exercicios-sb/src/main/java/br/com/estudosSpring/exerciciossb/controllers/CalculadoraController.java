package br.com.estudosSpring.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "calculadora")
public class CalculadoraController {

	@RequestMapping
	public String generico() {
		return "informe números";
	}
	
	@RequestMapping("/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return  a + b;
	}
	
	@GetMapping("/subtrair")
	public int subtrair(@RequestParam(name = "a") int a,@RequestParam(name = "b") int b) {
		return a - b;
	}
	
	
	
}

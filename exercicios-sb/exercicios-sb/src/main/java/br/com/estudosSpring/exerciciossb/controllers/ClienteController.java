package br.com.estudosSpring.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudosSpring.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping(path = "clientes")
public class ClienteController {

	
	//TESTE
//	@GetMapping("/{nome}")
//	public Cliente obterTeste(@PathVariable String nome) {
//		return new Cliente(5, nome, "564.465.897-77");
//		
//	}
	
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-99");
	}

	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id ,"Maria", "987.654.321-00");
	}
	
	@GetMapping
	 public Cliente obterClientePorId2(  //está colocando um valor padrao caso não seja colocado na URL
			 @RequestParam(name = "id", defaultValue = "1") int id) { //esta exigindo um parametro para chamar a URL
		 return new Cliente(id, "João Augusto", "111.555.666-88");
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

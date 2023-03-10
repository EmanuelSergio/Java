package br.com.estudosSpring.exerciciossb.model.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;

	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Produto(String nome) {
		super();
		this.nome = nome;
	}



	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
 
} 

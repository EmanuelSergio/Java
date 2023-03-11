package br.com.estudosSpring.exerciciossb.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank //obriga o valor a ser preenchido
	private String nome;

	@Min(value = 0)//anotacao que diz que o preco minimo é 0
	private double preco;

	@Min(0) //valor minimo
	@Max(1)//valor maximo
	private double desconto;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.desconto = desconto;
		this.preco = preco;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}

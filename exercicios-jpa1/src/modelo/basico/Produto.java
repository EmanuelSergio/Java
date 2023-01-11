package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos", schema = "curso_java")//posso indicar qual schema está sendo trabalhado
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "prod_nome", length = 200, nullable = false)//estrategia para editar o nome da coluna e o tamanho, nao nullo
	private String nome;
	
	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)//precision = numeros na frente da virgulo, scale = numeros antes da vírgula
	private Double preco;

	public Produto() {
		
	};
	 
	public Produto(Long id, String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public Long getId() {
		return id;
	}

	
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
}

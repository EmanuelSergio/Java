package UEC;

public class Lutador implements Luta {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private int peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, int peso,  int vitorias,
			int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	

	public int getPeso() {
		return peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
		this.setCategoria();;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria ="invalido";
		}else if(this.peso <= 70.3){
			this.categoria = "peso leve";
		}else if(this.peso <= 83.9) {
			this.categoria = "Peso medio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Peso pesado";	
		}else {
			this.categoria="invalido";
		}
		
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	
	
	@Override
	public void apresentar() {
		System.out.println("---------Apresetação---------");
		System.out.println("Nome: " +this.getNome());
		System.out.println("Nacionalidade: " +this.getNacionalidade());
		System.out.println("Idade: " +this.getIdade());
		System.out.println("Altura: " +this.getAltura());
		System.out.println("Peso: " +this.getPeso() +" Kg");
		System.out.println("Categoria: " +this.getCategoria());
		System.out.println("Vitorias: " +this.getVitorias());
		System.out.println("Derrotas: " +this.getDerrotas());
		System.out.println("Empates: " +this.getEmpates());
		
	}
	

	@Override
	public void status() {
		System.out.println(this.getNome() +" = " +this.getNacionalidade());
		System.out.println(this.getCategoria());
		System.out.println(this.getVitorias() +" Vitorias");
		System.out.println(this.getDerrotas() +" Derrotas");
		System.out.println(this.getEmpates() +" Empates");
		
	}

	@Override
	public void ganharLuta() {
		this.setVitorias(getVitorias()+1);
	}

	@Override
	public void perderLuta() {
		this.setDerrotas(getDerrotas()+1);
	}

	@Override
	public void empatarLuta() {
		this.setEmpates(getEmpates()+1);
	}

	
}

package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable //permite que use em outras entidades (usado para o conceito de orientação objeto)
public class Endereco {

	private String logradouro;
	private String complemento;
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
	
}

package br.com.emanuel.calculadora.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

	private enum TipoComando  {
		ZERAR, NUMERO, DIVISAO, MULTIPLICACAO, SUBTRACAO, SOMA, IGUAL, VIRGULA,INVERTER; 
	};
	
	
	
	private static final Memoria instancia = new Memoria();
	
	private final List<MemoriaObservador> observadores = 
			new ArrayList<MemoriaObservador>();

	private TipoComando ultimaOperacao = null;
	private boolean substituir = false;
	private String textoBuffer = "";
	private String textoAtual = "";
	
	
	
	private Memoria() {

	}

	

	public static Memoria getInstancia() {
		return instancia;
	}

	public void adicionarObservador(MemoriaObservador o ) {
		observadores.add(o);
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0":textoAtual;
	}
	
	public void processarComando(String texto) {
		
		TipoComando tipoComando = detectarTipoComando(texto);
		System.out.println(tipoComando);
		
		if(tipoComando == null) {
			return;
		}else if(tipoComando == TipoComando.ZERAR) {
			textoAtual = "";
			textoBuffer="";
			substituir=false;
			ultimaOperacao=null;
		}else if(tipoComando == TipoComando.INVERTER && textoAtual.contains("-")) {
			textoAtual = textoAtual.substring(1);
		}else if(tipoComando == TipoComando.INVERTER && !textoAtual.contains("-")) {
			textoAtual = "-" + textoAtual;
		}else if(tipoComando == TipoComando.NUMERO 
				|| tipoComando == TipoComando.VIRGULA) {
			textoAtual = substituir? texto : textoAtual + texto;
			substituir = false;
		}else {
			substituir=true;
			textoAtual = obterresultadoOPeracao();
			
			textoBuffer = textoAtual;
			ultimaOperacao = tipoComando;
		}
		
		
		
		observadores.forEach(o->o.valorAlterado(getTextoAtual()));
	}



	private String obterresultadoOPeracao() {

		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			return textoAtual;
		}
		
		double numeroBuffer = 
				Double.parseDouble(textoBuffer.replace(",", "."));
		double numeroAtual = 
				Double.parseDouble(textoAtual.replace(",", "."));
		
		double resultado = 0;
		
		if(ultimaOperacao == TipoComando.SOMA) {
			resultado = numeroBuffer + numeroAtual;
		}else if(ultimaOperacao == TipoComando.SUBTRACAO) {
			resultado = numeroBuffer - numeroAtual;
		}else if(ultimaOperacao == TipoComando.MULTIPLICACAO) {
			resultado = numeroBuffer * numeroAtual;
		}else if(ultimaOperacao == TipoComando.DIVISAO) {
			resultado = numeroBuffer / numeroAtual;
		}/*else if(ultimaOperacao == TipoComando.INVERTER) { <--- MINHA LOGICA (NAO ESTÁ ERRADO).
			resultado = (double) numeroAtual*-1;
		}*/
		
		
		String texto = Double.toString(resultado).replace(".", ",");
		boolean inteiro = texto.endsWith(",0");
		return inteiro ? texto.replace(",0", ""):texto;
	}



	private TipoComando detectarTipoComando(String texto) {
		
		if(textoAtual.isEmpty() && texto =="0") {
			return null;
		}
		try {
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {
			//quando não for numero...
			
			if("AC".equals(texto)) {
				return TipoComando.ZERAR;
			}else if("/".equals(texto)) {
				return TipoComando.DIVISAO;
			}else if("*".equals(texto)) {
				return TipoComando.MULTIPLICACAO;
			}else if("+".equals(texto)) {
				return TipoComando.SOMA;
			}else if("-".equals(texto)) {
				return TipoComando.SUBTRACAO;
			}else if("=".equals(texto)) {
				return TipoComando.IGUAL;
			}else if(",".equals(texto) && !textoAtual.contains(",")) {
				return TipoComando.VIRGULA;
			}else if("±".equals(texto)) {
				return TipoComando.INVERTER;
			}
			
			
		}

		
		return null;
	}
	
	
}

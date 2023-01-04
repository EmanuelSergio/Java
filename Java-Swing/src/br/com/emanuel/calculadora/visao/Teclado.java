package br.com.emanuel.calculadora.visao;


import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel{

	private final Color COR_CINZA_ESCURO = new Color(68,68,68);
	private final Color COR_CINZA_CLARO = new Color(99,99,99);
	private final Color COR_LARANJA = new Color(242,163,60);
	
	public Teclado() {

	GridBagLayout layout = new GridBagLayout();
	GridBagConstraints c = new GridBagConstraints();
		
	setLayout(layout);
	
	
	//LINHA 1
	adicionarBotao("AC", COR_CINZA_ESCURO,c,0,0);
	adicionarBotao("+/-", COR_CINZA_ESCURO,c,1,0);
	adicionarBotao("%", COR_CINZA_ESCURO,c,2,0);
	adicionarBotao("/", COR_LARANJA,c,3,0);
	
	//LINHA 2
	adicionarBotao("7", COR_CINZA_CLARO,c,0,1);
	adicionarBotao("8-", COR_CINZA_CLARO,c,1,1);
	adicionarBotao("9", COR_CINZA_CLARO,c,2,1);
	adicionarBotao("*", COR_LARANJA,c,3,1);
	
	//LINHA 3
	adicionarBotao("4", COR_CINZA_CLARO,c,0,2);
	adicionarBotao("5", COR_CINZA_CLARO,c,1,2);
	adicionarBotao("6", COR_CINZA_CLARO,c,2,2);
	adicionarBotao("-", COR_LARANJA,c,3,2);
	
	//LINHA 4
	adicionarBotao("1", COR_CINZA_CLARO,c,0,3);
	adicionarBotao("2", COR_CINZA_CLARO,c,1,3);
	adicionarBotao("3", COR_CINZA_CLARO,c,2,3);
	adicionarBotao("+", COR_LARANJA,c,3,3);
	
	//LINHA 5
	
	adicionarBotao("0", COR_CINZA_CLARO,c,0,4);
	adicionarBotao(",", COR_CINZA_CLARO,c,1,4);
	adicionarBotao("=", COR_LARANJA,c,3,4);
	
	
	
	
	
	
	
	
	}

	private void adicionarBotao(String string, Color cor, GridBagConstraints c, int x, int y) {

		c.gridx=x;
		c.gridy=y;
		Botao botao = new Botao(string, cor);
		add(botao,c);
		
		
		
		
		
	}
	
}

package br.com.emanuel.calculadora.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {
		
		organizarLayout();
		
		
		
		setSize(242,332);//define o tamanho da tela quando a aplicacao inicia
		//setUndecorated(true);//tira a barrinha de fechar 
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//vai finalizar a aplicacao apos fexar a tela
		setLocationRelativeTo(null);//faz a janela iniciar no meio da tela
		setVisible(true);//quando iniciar a aplicacao, ja aparece uma tela
	}
	
	private void organizarLayout() {

		 
		
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233,60));
		add(display, BorderLayout.NORTH);
		
		
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
		
		
	}

	public static void main(String[] args) {
		
		new Calculadora();
		
		
		
		
		
		
	}
	
}

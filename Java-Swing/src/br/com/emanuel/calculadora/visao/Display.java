package br.com.emanuel.calculadora.visao;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.emanuel.calculadora.modelo.Memoria;
import br.com.emanuel.calculadora.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{

	private final JLabel label; 
	
	public Display() {
		
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46,49,50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.white);
		label.setFont(new Font("courier", Font.PLAIN, 25));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 15));
		
		
		add(label);
		//setSize(242,70);
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
	
}

package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		//faz com que a opercao de fechar a janela,
																			//finalize a aplicacao. Por padrao ela n encerra automaticamente
		janela.setSize(600, 200);//define um valor padrao para a janela
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);//null = centralizar na tela do computador
		
		
		
		
		
		JButton botao = new JButton("Clicar"); //instaciamento de botao. Existem varios tipos de botoes
		
		janela.add(botao);
		
		
		botao.addActionListener(e -> System.out.println("evento ocorreu"));
		
		
		
		janela.setVisible(true);
		
		 
		
		
		
		
	}
	
}

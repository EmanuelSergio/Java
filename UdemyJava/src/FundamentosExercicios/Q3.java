package FundamentosExercicios;


import javax.swing.JOptionPane;

public class Q3 {

	public static void main(String[] args) {

		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno");
		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota do aluno");
		String nota2 = JOptionPane.showInputDialog("Informe a segunda nota do aluno");
		
		
		double media = (Double.parseDouble(nota1)+Double.parseDouble(nota2))/2;
		
		System.out.printf("%s tirou %2f na media", nome, media);
	
		if(media >= 7)
			System.out.printf("\n"
					+ "%s está Aprovado", nome);
		else if(media < 7 && media > 4)
			System.out.printf("%s esta em Recuperacao", nome);
		
		else if(media <= 4 && media >= 0)
			System.out.printf("%s está reprovado", nome);
		else
			System.out.println("Nota Invalida");
	}

}

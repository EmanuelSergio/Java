package ListaoitoExtra;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int cont;
		String[] gabarito = {"a", "b", "c", "d", "e",}; 
		String[][] matricula = new String [3][6];
		
		for (int i = 0; i < matricula.length; i++) {
			System.out.println("Informe a matricula do º" +i +" aluno");
			matricula[i][0] = leia.next();
		for (int j = 1; j < matricula[i].length; j++) {
		System.out.println("Informe a resposta da º" +j +" questão");	
		matricula[i][j] = leia.next();
		
		}
		}

		for (int i = 0; i < matricula.length; i++) {
			cont = 0;
			System.out.println("Matricula " +matricula[i][0]);
			System.out.print("Resultado ");
			for (int j = 0; j < gabarito.length; j++) {
				System.out.print(matricula[i][j+1] +" ");
				
				if(matricula[i][j+1].equalsIgnoreCase(gabarito[j]));
				cont++;
			}
			
		}
		
		
		
		
		
		
		
		leia.close();
	}

}

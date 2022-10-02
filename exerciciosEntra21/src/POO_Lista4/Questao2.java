package POO_Lista4;

import java.util.Scanner;

public class Questao2 {


	Scanner leia = new Scanner(System.in);
		
		String acao;
		
		public Questao2() {
		}

		public void menu() {
			
			System.out.println("");
			acao = leia.next();
			
			if(acao.equalsIgnoreCase("somar")) {
				
				
				
			}
			
			
		}
		
		
		public static int somar(int n1, int n2) {
			
			//n1=num1;
			//n2=num2;
			System.out.print(n1 +" + " +n2 +" = ");
			return n1+n2;		

			
		}
		
		public static int subtrair(int n1, int n2) {
			
			
			System.out.print(n1 +" - " +n2 +" = ");
			return n1 - n2;
			
			
			
		}
		
		public static int multiplicar(int n1, int n2) {
			
			System.out.print(n1 +" x " +n2 +" = ");
			return n1 * n2;
			
			
		}
		
		public static int dividir(int n1, int n2) {
			
			System.out.print(n1 +" / " +n2 +" = ");
			return n1 / n2;
			
		
			
		}
		
		
		public static double elevacao(int n1, int n2) {
			
			System.out.print(n1 +" ^ " +n2 +" = ");
			return Math.pow(n1, n2);
			
			
			
			
		}
	}

	
	
	


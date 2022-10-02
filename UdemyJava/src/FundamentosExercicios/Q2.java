package FundamentosExercicios;

public class Q2 {

	public static void main(String[] args) {

		int ano = 2020;
		
		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);
		
		
		if(bissexto == true) {
			System.out.println("ola");
			
			System.out.printf("O ano de %d é um ano bissexto", ano );
		}
		
		System.out.println("ANO NORMAL");
		
		System.out.println(bissexto);
		
	}

}

package ListaSeteTratamentoDeExcecoes;

public class TesteExceptio {public static void main(String[] args) {
	
	
	
	
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	
}

static void metodo1() {
	
		System.out.println("Inicio do metodo 1");
		metodo2();
		System.out.println("fim do metodo 1");
	
	
	
}

static void metodo2() {
	
	System.out.println("Inicio do metodo 2");
	try {
		int[] array = new int[10];
		
		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.print(i +" - " );
		}
		
		System.out.println("\nFim do metodo 2");
		
		
		
	}catch(ArrayIndexOutOfBoundsException exception) {
		
		
		System.out.println("\n"
				+ "FIM DO METODO 2 - APÓS A EXCEÇÃO");
		
	}
	
	

	
}



}

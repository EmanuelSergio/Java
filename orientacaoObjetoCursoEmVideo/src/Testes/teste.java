package Testes;

public class teste {

	public static void main(String[] args) {
		System.out.println("Início do main"); // 1ª Print
		metodo1();//  Convoca "executa" método um.
		System.out.println("Fim do main"); // 7º Print
	}

	static void metodo1() {
		System.out.println("Início do método1");// 2º Print
		metodo2(); //  Convoca "Executa" método dois.
		System.out.println();
		System.out.println("Fim do método1"); // 6º Print
	}

	static void metodo2() {
		System.out.println("Início do método2\n"); // 3º Print
		//São executados os algoritmos abaixo
		try {
			int[] array = new int[10];
			for (int i = 0; i <= 15; i++) {
				array[i] = i;
				System.out.print(i+". "); // 4º Print
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			int[] array = new int[10];
			for (int j = 0; j < array.length; j++) {
				array[j] = j;
			}
			System.out.println("\nFim do método2"); // 5º Print
		}
	}
	
	
	
	
}

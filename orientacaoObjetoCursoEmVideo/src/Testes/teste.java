package Testes;

public class teste {

	public static void main(String[] args) {
		System.out.println("In�cio do main"); // 1� Print
		metodo1();//  Convoca "executa" m�todo um.
		System.out.println("Fim do main"); // 7� Print
	}

	static void metodo1() {
		System.out.println("In�cio do m�todo1");// 2� Print
		metodo2(); //  Convoca "Executa" m�todo dois.
		System.out.println();
		System.out.println("Fim do m�todo1"); // 6� Print
	}

	static void metodo2() {
		System.out.println("In�cio do m�todo2\n"); // 3� Print
		//S�o executados os algoritmos abaixo
		try {
			int[] array = new int[10];
			for (int i = 0; i <= 15; i++) {
				array[i] = i;
				System.out.print(i+". "); // 4� Print
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			int[] array = new int[10];
			for (int j = 0; j < array.length; j++) {
				array[j] = j;
			}
			System.out.println("\nFim do m�todo2"); // 5� Print
		}
	}
	
	
	
	
}

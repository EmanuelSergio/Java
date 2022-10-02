package Fundamentos;


public class DesafioFor {public static void main(String[] args) {
	
	String valor = "#";
	
	for (int i =0; i <= 5; i++) {
		System.out.println(valor);
		valor += "#";
		
		
	}
	
	
	for (String v = "#"; !v.equals("######"); v+= "#") {
		System.out.println(v);
	}
	
	//esse disafio consistiu em fazer um laço for sem numeros, passando o String e utilizando o equals para ler o conteudo
	
}

}

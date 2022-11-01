package classe;

import java.util.Scanner;

public class valorNulo {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		String s1 = "meu nome é ";
		System.out.println(s1.concat("!!!")); //forma de concatenar
		
		//System.out.println("Informe seu nome");
		//String nome = leia.next();
		
		//System.out.println(s1.concat(nome));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			d1.mes=3;
			System.out.println(d1.obterDataFormatada());
		}
		
		
		String s2 = Math.random() > 0.5 ? "Ola mundo " : null;
		
		if(s2!=null) {
			
			System.out.println(s2.concat("????"));
			
		}
		
	
		
	}

}

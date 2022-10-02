package listaSeis;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num=1, loop=1 ,tot;
		
		System.out.println("informe o numero para ver sua tabuada");
		num = leia.nextInt();
		
		while(loop<11) {
			
		tot = num*loop; 
		
		System.out.println(loop +" X " +num +" = " +tot);
		++loop;
		}
		
		leia.close();
		
	}

}

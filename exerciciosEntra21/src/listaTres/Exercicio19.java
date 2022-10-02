package listaTres;

import java.util.Scanner;

public class Exercicio19 {public static void main(String[] args) {
	
	 Scanner leia = new Scanner(System.in);
	
	 int entrada;
	 float h, m, s;
	 
	 System.out.println("Digite a hora");
	 entrada = leia.nextInt();
	 
	 h=entrada;
	 m= entrada * 60;
	 s= m * 60;
	 
	 System.out.println(h +" horas, são: " +m +" minutos, e: " +s +" segundos");
	 
	 
	 leia.close();
	 
	 
	 
}

}

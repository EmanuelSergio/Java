package listaTres;
import java.util.Scanner;
public class Exercicio13 {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int a, b, c;
	
	a = 10;
	b = 20;
	
	System.out.println("a= " +a +" b= " +b);
	
	c = a;
	a = b;
	b = c;
	
	System.out.println("a= " +a +" b= " +b);
	
	
	leia.close();
	
	
	
	
}

}

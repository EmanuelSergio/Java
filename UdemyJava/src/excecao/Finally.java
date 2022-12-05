package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		try {
		
			
			System.out.println(7/leia.nextInt());
			
			
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("Finally...");
			leia.close();
		}
		
		System.out.println("FIM");
		
		
		 
		
	}
	
}

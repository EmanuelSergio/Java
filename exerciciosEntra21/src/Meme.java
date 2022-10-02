import java.util.Scanner;

public class Meme {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);

	

	
	boolean galinha = false;
	
	
	System.out.println("GALINHA?");
	galinha = leia.hasNext();
	if(galinha == true)
		System.out.println("CHOCADA");
	
	
	
	
	
	leia.close();
	
}

	
}

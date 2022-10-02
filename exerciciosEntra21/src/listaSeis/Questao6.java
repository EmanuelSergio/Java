package listaSeis;

public class Questao6 {public static void main(String[] args) {
	
	float c=1.5f, j=1.1f;
	int loop=0;
	
	do{
		
		loop++;
		
		c += 0.02f;
		j += 0.03f;
		
		
	}while(j<c);
	
	System.out.println("Ele levou : " +loop +" anos para alcançar Chico");
	
}

}

package listaSeis;

public class Questao10 {public static void main(String[] args) {
	
	int num=0, x=1001;
	
	do {
	x++;	
	if(x % 11 == 5) {
	num++;
	}
	
	
	}while(num<5);
		
		
	System.out.println(x +" é o quinto numero maior que 1000,\n"
			+ " que é divisivel por 11 com resto 5");

		
	
	
	
	
}

}

package listaSeis;

public class Questao17 {public static void main(String[] args) {
	
	int loop=0;
	float a=80000f,b=200000f;
	
	do {
		
		
		a = (a * 0.03f) + a;
		b = (b * 0.015f) + b;
		loop++;
	}while(a<b);
	
	System.out.println(" levou " +loop +" anos para a popula�ao dos paises se igualar \n"
			+ "pa�s A :" +a +" pessoas" +"\n"
					+ "pa�s B: " +b +" pessoas");
}

}

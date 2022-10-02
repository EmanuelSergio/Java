package listaSeis;

public class Questao17 {public static void main(String[] args) {
	
	int loop=0;
	float a=80000f,b=200000f;
	
	do {
		
		
		a = (a * 0.03f) + a;
		b = (b * 0.015f) + b;
		loop++;
	}while(a<b);
	
	System.out.println(" levou " +loop +" anos para a populaçao dos paises se igualar \n"
			+ "país A :" +a +" pessoas" +"\n"
					+ "país B: " +b +" pessoas");
}

}

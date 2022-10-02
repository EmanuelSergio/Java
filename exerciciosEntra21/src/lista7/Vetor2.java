package lista7;

import java.util.Scanner;

public class Vetor2 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int[]v1 = new int[3];
	int[]v2 = new int[3];
	int sov1=0;
	int sov2=0;
	String resposta;
	
	
for (int i = 0; i < v1.length; i++) {
	
	System.out.println("Informe o vetor 1");
	v1[i] = leia.nextInt();
	sov1 += v1[i];
	
}for(int x = 0; x<v2.length; x++) {
	System.out.println("Informe o vetor 2");
	v2[x] = leia.nextInt();
	sov2+=v2[x];
}
	
resposta =(sov1 > sov2) ? "O vetor 1 é maior" : "O vetor 2 é maior";
System.out.println(resposta);
	
	
	leia.close();
	
}

}

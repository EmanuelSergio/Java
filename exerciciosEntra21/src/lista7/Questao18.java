package lista7;


public class Questao18 {

	public static void main(String[] args) {

	int[] a = new int[10];
	int primo=0, x=1, fim=101;
	
	for (int i = 0; i < a.length; i++) {
		for (int j = x; j <= fim; j++) {
		primo= fim % j == 0 ? primo += 1 : primo;
		}	
		
		if(primo == 2) {
			a[i] = fim;
		}else {
			i--;
		}
		primo = 0; 
		fim +=1;
	
	
				
	}
	for(int i = 0; i < a.length; i++) {
		System.out.println("Vetor ["+i+"]:" +a[i]);
			
		}


	}

}

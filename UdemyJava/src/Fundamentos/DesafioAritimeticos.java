package Fundamentos;


public class DesafioAritimeticos {public static void main(String[] args) {
	
	
	double a1 = Math.pow(6*(3+2), 2);
	int a2 = (int) Math.pow(a1, 2); //elevado a segunda potencia
	int b1 = (int) 3*2;
	int b3 = (int) a2/b1;
	
	
	int c1 = (1-5)*(2-7);
	int d1 = 2;
	int e1 = (int) Math.pow(c1, 2);
	int e2 = (int) Math.pow(d1, 2);
	
	int e3 = e1/e2;
	
	int s1 = b3-e3;
	
	int s2 = (int) Math.pow(s1, 3);
	int p1 = 10;
	int s3 = (int) Math.pow(p1, 3);
	

	
	System.out.println(s2/s3);
}


}

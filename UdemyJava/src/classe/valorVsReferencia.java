package classe;

public class valorVsReferencia {public static void main(String[] args) {
	
	
	int a = 2;
	int b = a;
	
	a++;
	b--;
	
	System.out.printf("a: %d b: %d", a, b);
	
	Data a1 = new Data();
	Data a2 = a1;
	
	a2.ano=2004;
	
	System.out.println("");
	
	
	System.out.println(a1.obterDataFormatada(04, 10, 2005));
	
	System.out.println(a1.ano);
	System.out.println(a2.ano);
	
	voltarparadataoriginal(a1);
	
	System.out.println(a1.obterDataFormatada());
	System.out.println(a2.obterDataFormatada());
	
	int c = 5;
	voltarparaprimitivo(c);
	System.out.println("\n" +c);
	
}

	
	static void voltarparadataoriginal(Data d) {
		d.dia=1;
		d.mes=1;
		d.ano=1970;
		
	}
	
	static void voltarparaprimitivo(int c) {
		c++;
	}
	
	
	
	
	
	
}

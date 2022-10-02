package Lista07;

public class ContaTeste {public static void main(String[] args) throws ContaExcecao {
	
	Conta1 c1 = new Conta1();
	
	
	try {
		
		
		c1.setSaldo(1000);
		c1.setLimite(500);	
		c1.saqueconta(1000);
		
		
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
		
	}
	
	
	
}

}

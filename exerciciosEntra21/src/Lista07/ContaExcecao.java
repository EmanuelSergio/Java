package Lista07;

public class ContaExcecao extends Exception {

	@Override
	public String getMessage() {

		
		return "Saldo na conta n�o � suficiente para o saque";
	}
	
	
	
}

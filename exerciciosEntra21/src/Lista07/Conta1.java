package Lista07;

public class Conta1 {

	private double limite;
	private double saldo;
	
	
	public Conta1() {
		
	}

	public void saqueconta(double saque) throws ContaExcecao {
		
		if(saque <= this.getSaldo() && saque <= this.getLimite()) {
			this.setSaldo(getSaldo() - saque);
			System.out.println("Saque realizado com sucesso \n"
					+ "Saldo atual $" +this.getSaldo());
			
			
		} else if(saque > this.getSaldo() || this.getLimite() < saque){
			throw new ContaExcecao();
			
		}
			
	}
	
	

	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}

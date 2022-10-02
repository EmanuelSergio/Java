package lista10;

public class Conta {

	String nome;
	int numero;
	double saldo, limite, saque, tot, totcheque;
	boolean statusEspecial;
	double cheque, tot1, dep;

	void criarConta() {
		
		
		System.out.println("Nome: " +nome);
		System.out.println("");
		System.out.println("Numero da conta: " +numero);
		System.out.println("");
		System.out.println("Saldo " +saldo);
		System.out.println("");
		
		if(statusEspecial == false)
		System.out.println("Conta não possui cheque especial");
		else
			System.out.println("Conta possui cheque especial");
		System.out.println("cheque especial disponivel $" +cheque);
	}
	
	String saqueconta (double saldo1) {
		
		System.out.println("\n"
				+ "");
		System.out.println("Saque no valor de $" +saque);
		
		
		saldo1=saldo;
		
		if(saque <= 0)
			return "";
		
			
		if(saldo >= saque) {			
			saldo = saldo - saque;
			return "Saque realizado. O saldo atual é de $"+saldo;
		} 
		if(saque > saldo && statusEspecial == true) {
			totcheque = saldo+ cheque;
			if(totcheque < saque) {
				return "Sua conta não tem saldo nem cheque especial suficiente para este saque";
			}
		}
		if((saque > saldo) && ((saldo+cheque)>=saque) && statusEspecial == true) {
			tot1 = (saldo+cheque)-saque;
			saldo=0;
			return "O seu saldo é insuficiente. Cheque especial usado. Cheque especial restante $"+tot1;
		}
		else
			return "Saque não realizado";
			
		
		
		}
	
	void deposito () {
		
		System.out.println("");
		
		saldo += dep;
		System.out.println("Deposito efetuado no valor de $" +dep);
		System.out.println("Saldo atual $"+saldo);
		
		
	}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	


package Construtores;

import java.util.Scanner;

public class Questao2 {
	Scanner leia = new Scanner(System.in);

	

	
	
	
	
	private String nome;
	private int numero;
	private double saldo=0, limite, saque, tot, totcheque;
	protected boolean statusEspecial;
	private double cheque, tot1, dep;

	
	
	
	
	
	
	public Questao2() {
	}

	public Questao2(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	
	
	
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero>0)
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double getTot() {
		return tot;
	}

	public void setTot(double tot) {
		this.tot = tot;
	}

	public double getTotcheque() {
		return totcheque;
	}

	public void setTotcheque(double totcheque) {
		this.totcheque = totcheque;
	}

	public boolean isStatusEspecial() {
		return statusEspecial;
	}

	public void setStatusEspecial(boolean statusEspecial) {
		this.statusEspecial = statusEspecial;
	}

	public double getCheque() {
		return cheque;
	}

	public void setCheque(double cheque) {
		this.cheque = cheque;
	}

	public double getTot1() {
		return tot1;
	}

	public void setTot1(double tot1) {
		this.tot1 = tot1;
	}

	public double getDep() {
		return dep;
	}

	public void setDep(double dep) {
		this.dep = dep;
	}

	
	
	public void criarConta() {
		
		System.out.println("Informe o nome");
		this.nome=leia.nextLine();
		System.out.println("Informe o numero da conta corrente");
		setNumero(leia.nextInt());
		System.out.println("Informe se possui cheque especial, true ou false");
		statusEspecial=leia.nextBoolean();	
		if(statusEspecial == true) {
			System.out.println("Informe um limite de cheque especial");
			cheque=leia.nextDouble();
						
		}else
			System.out.println("");
		
		
	}
	
	public void status() {
		
		
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
	
	public void saque() {
		
		System.out.println("Informe o valor do saque");
		 saque=leia.nextDouble();
		 
		 
		System.out.println("\n"
				+ "");
		System.out.println("Saque no valor de $" +saque);
		
	}
	
	 String saqueconta () {
		
		
		
		
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
		System.out.println("Informe o valor do deposito");
		dep=leia.nextDouble();
		
		saldo += dep;
		System.out.println("Deposito efetuado no valor de $" +dep);
		System.out.println("Saldo atual $"+saldo);
		
		
	}
	
	
	
	
}

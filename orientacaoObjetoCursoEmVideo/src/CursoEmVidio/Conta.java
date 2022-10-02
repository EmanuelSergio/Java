package CursoEmVidio;

public class Conta  {

	private int numConta;
	private String nome;
	private boolean status;
	private double saldo;
	private String tipo;
	
	public Conta() {
		this.saldo=0;
		this.status=false;
	}
	
	public void info() {
		System.out.println("Numero da conta: " +this.getNumConta());
		System.out.println("Nome: " +this.getNome());
		System.out.println("Status: " +this.getStatus());
		System.out.println("Saldo: $" +this.getSaldo());
		System.out.println("Tipo da conta: " +this.getTipo());
		
		
	}
	
	
	public void abrirConta(String tipo) {
		setTipo(tipo);
		setStatus(true);
		if(tipo == "cc") {
			this.setSaldo(50);
		}else if(tipo == "cp"){
			this.setSaldo(150);
		}		
	}
	public void fecharConta() {
		
		if(this.getSaldo() > 0) {
			System.out.println("Saque todo o dinheiro da conta para fechar a conta");
			
		}else if(this.getSaldo() < 0) {
			System.out.println("Conta nao pode ser fechada pois ainda possui debitos");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada");
		}
		
	}
	public void depositar(double valor) {
		
		if(this.getStatus() == true) {
			this.setSaldo(getSaldo()+valor);
			System.out.println("Deposito realizado! \n"
					+ "Saldo atual: " +getSaldo());
		}
		else {
			System.out.println("Não é possivel depositar nessa conta");
		}
		
	}
	
	
	public void Sacar(double saque) {
		if(this.getSaldo() >= saque) {
			this.setSaldo(getSaldo()-saque);
			System.out.println("Saque realizado!");
			
		}else if(this.getStatus() == false) {
			System.out.println("Conta fechada. Impossivel de realizar o saque");
		}
		
		else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	
	public void pagarMensal() {
		
		int valor=0;
		if(this.getTipo() == "CC") {
			valor = 15;
			
		}else if (this.getTipo() == "CP") {
			valor = 20;
		}
		
		if(this.getStatus() == true) {
			if(this.getSaldo() < valor) {
				System.out.println("Saldo insuficiente para pagar a mensalidade");
			}else if(this.getSaldo() >= valor) {
				this.setSaldo(getSaldo()-valor);
				System.out.println("Mensalidade paga com sucesso! \n"
						+ "Saldo disponivel: $" +this.getSaldo());
				
			}
			
		}else {
			System.out.println("Conta inativa");
		}
		
		
	}
	
	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
	
}

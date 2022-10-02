package Lista9;

public class Questao5 {

	public static void main(String[] args) {

		banco conta = new banco();
		
		conta.numeroConta = 216545;
		conta.limite = 1000000;
		conta.saldo = 1000;
		conta.Status = "Especial";
		conta.nome = "Emanuel";
		
		System.out.println("Nome " +conta.nome);
		System.out.println("Numero da conta " +conta.numeroConta);
		System.out.println("Limite $" +conta.limite);
		System.out.println("Saldo $"+conta.saldo);
		System.out.println("Status " +conta.Status);
		
		
		
	}

}

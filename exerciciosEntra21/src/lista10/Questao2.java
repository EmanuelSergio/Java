package lista10;

public class Questao2 {

	public static void main(String[] args) {

		
	Conta cont = new Conta();
		
		cont.nome="emanuel";
		cont.limite=5000;
		cont.numero=12345;
		cont.statusEspecial=true;
		cont.saldo=5000;
		cont.saque=4000;
		cont.cheque=1500;
		cont.dep=1000;
		
		cont.criarConta();
		
		System.out.println(cont.saqueconta(0));
		
		cont.deposito();
	}

}

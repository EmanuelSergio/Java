package CursoEmVidio;

public class Exercicio5 {public static void main(String[] args) {
	
	
	Conta p1 = new Conta();
	
	p1.setNome("Jubileu");
	p1.setNumConta(445646);
	
	p1.abrirConta("cp");
	p1.info();
	
	p1.depositar(5000);
	p1.Sacar(5150);
	p1.fecharConta();
	
	
}

}

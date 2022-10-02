package POO_Lista4;

import java.util.Scanner;

public class Main4 {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	Agenda pess = new Agenda();
	Contato contatos[] = new Contato[3];
	
	System.out.println("Informe o nome da agenda");
	pess.setNomeAgenda(leia.nextLine());
	
	for (int i = 0; i < contatos.length; i++) {
		Contato x = new Contato();
		
		System.out.println("Informe o nome do contato");
		x.setNome(leia.next());
		System.out.println("Informe o telefone do contato");
		x.setTelefone(leia.next());
		System.out.println("Informe  o email do contato");
		x.setEmail(leia.next());
		contatos[i] = x;
	}
	
	pess.setContatos(contatos);
	System.out.println(pess.menuver());
	
	leia.close();
	
}

}

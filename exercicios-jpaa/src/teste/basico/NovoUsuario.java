package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Lucas", "girardi@gmail.com.br");
		
		em.getTransaction().begin();  // abre a conexao para a tranção
		em.persist(novoUsuario);	//vai inserir um elemento no banco de dados
		em.getTransaction().commit(); // fecha a conexao para a transação
		
		System.out.println("O id gerado foi => " +novoUsuario.getId());
		
		em.close();
		emf.close();
	}
}

package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 5L);
		em.detach(usuario);//tira o usuario do estado gerenciado
		
		
		
		usuario.setNome("Emanuel lindo");
		
		em.merge(usuario);//torna em um estado gerenciado e faz a persistencia
		
		
		em.getTransaction().commit();
		
		
		
		em.close();
		emf.close();
	}
	
}

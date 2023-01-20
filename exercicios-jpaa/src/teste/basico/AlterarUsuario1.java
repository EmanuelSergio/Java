package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 5L);
		
		System.out.println("nome => " +usuario.getNome() +"\nemail => " +usuario.getEmail());
		
		usuario.setNome("Emanuel Sergio Girardi");
		usuario.setEmail("girardi@gmail.com");
		
		em.merge(usuario);//pega o usuario que já está no banco e faz um update
		
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}
	
}

package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");//dentro da fabrica do entity, ele passa a persistencia que fica no arquivo xml
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 5L);
		
		System.out.println(usuario.getNome()); 
		
		 	  
		
		em.close();
		emf.close();
	}
	
}

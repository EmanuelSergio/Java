package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");	
	EntityManager em = emf.createEntityManager();	
		
	String jpql = "select u from Usuario u";	
	TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);//utilizamos essa interface query para passar um comando sql e adicinar paramentros para a chama dos valores do banco
	query.setMaxResults(5);//posso definir um limite de resultados que vai trazer a consulta
	
	List<Usuario> usuarios = query.getResultList();
	
	for (Usuario usuario : usuarios) {
		System.out.println("ID => " +usuario.getId()
		+"\nEmail => " +usuario.getEmail() +"\nNome => " +usuario.getNome());
	}
	
	
	em.close();	
	emf.close();
	}
	
}

package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {
			//logar -> log4j
		}
	}
	 
	public DAO () {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe=classe;
		em = emf.createEntityManager();
	}
	
	public DAO<E> abrirTransacao(){ 	
		
		em.getTransaction().begin();
		return this;
		
	}
	
	public DAO<E> fecharTransacao(){
		em.getTransaction().commit();
		return this;
	}
	
	public E obterPorId(Object id) {
		return em.find(classe, id);
	}
	
	public DAO<E> incluir(E entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade){
		return this.abrirTransacao().incluir(entidade).fecharTransacao();
	}
	
	public List<E> obterTodos(){
		return this.obterTodos(10, 0);
	}
	
	public List<E> obterTodos(int qtde,int deslocamento){
		if(classe == null) {
			throw new UnsupportedOperationException("CLASSE NULA");
		}
		
		String jpql = "select e from " +classe.getName() +" e";
		
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
		
		return query.getResultList();
	}
	
	public List<E> consultar(String nomeConsulta, Object... params){
		
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		
		for (int i = 0; i < params.length; i += 2) {//percorrendo de dois em dois parametros = 1º parametro e 2º valor do parametro
			query.setParameter(params[i].toString(), params[ i + 1]);
		}
		
		
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
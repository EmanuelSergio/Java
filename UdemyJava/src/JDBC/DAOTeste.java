package JDBC;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		
		System.out.println(dao.incluir(sql, "jao da ",50));
		System.out.println(dao.incluir(sql, "Sergio",51));
		System.out.println(dao.incluir(sql, "Lauro ",52));
		
		
		
		
	}
	
}

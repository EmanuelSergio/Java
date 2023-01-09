package JDBC;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "insert into pessoas (nome, codigo) values (?, ?)";
		
		System.out.println(dao.incluir(sql, "jao da silb", 1000));
		System.out.println(dao.incluir(sql, "Sergio Ervin", 1001));
		System.out.println(dao.incluir(sql, "Lauro Antig", 1002));
		
		
		
		
	}
	
}

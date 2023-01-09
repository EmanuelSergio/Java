package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class DesafioAtualizarRegistro {
public static void main(String[] args) throws SQLException{
	
	
	Connection conexao = FabricaConexao.getConexao();
	
	Scanner leia = new Scanner(System.in);

		
		System.out.println("Informe o id que deseja pesquisar");
		int id = leia.nextInt();
	
		String select = "select codigo, nome from pessoas where codigo = (?)";
		String update = "update pessoas set nome = ? where codigo = ?";

		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet r = stmt.executeQuery();//essa query ele traz de volta o resultado

		if (r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("Nome atual => " +p.getNome());
			leia.nextLine();
		}
		stmt.close();
		
		System.out.println("Informe o novo nome");
		String novoNome = leia.nextLine();
			 
		stmt = conexao.prepareStatement(update);
		stmt.setString(1, novoNome);
		stmt.setInt(2, id);
		stmt.execute();
		 
		
		System.out.println("deu");
		
		
		
		
		leia.close();
		
	
	
	
}
	
}

package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException{
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("informe o id que deseja ser deletado");
		int id = leia.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String deleteSQL = "delete from pessoas where codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(deleteSQL);
		stmt.setInt(1, id);
		
		int contador = stmt.executeUpdate();
		
		if (contador > 0)  { //esse metodo retorna a quantidade de linhas afetadas
			System.out.println("Pessoa excluida com sucesso");
			System.out.println("linhas afetadas: "+contador);
		}else {
			System.out.println("Nada feito");
		}
		
		
		
		
		conexao.close();
		leia.close();
	}
}

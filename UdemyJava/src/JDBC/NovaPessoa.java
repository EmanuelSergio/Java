package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa  {

	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome");
		String nome = entrada.nextLine();
		
		System.out.println(nome);
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "Insert into pessoas (nome) values"
				+ "(?)";
		
		/* FORMA PARA SETAR O ID MANUALMENTE:
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);//tudo que entrar como valor aqui, sera setado como string. Impossibilitando um ataque de injeção no  banco
		stmt.setInt(2, 100);
		*/
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);//tudo que entrar como valor aqui, sera setado como string. Impossibilitando um ataque de injeção no  banco
		
		
		
		stmt.execute();
		
		System.out.println("incluido");
		
		entrada.close();
		
		
		
		
		
	}
	
}

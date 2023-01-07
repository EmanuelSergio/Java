package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		final  String usuario = "root";
		final String senha = "root";
		
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
		
		
		
		Statement stmt = conexao.createStatement();
		stmt.execute("create database if not exists curso_java");
		
		
		
		
		
		System.out.println("banco criado");
		
		conexao.close();
		
		
		
		
		
	}
	
}

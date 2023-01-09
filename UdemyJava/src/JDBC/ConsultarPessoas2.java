package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		
Connection conexao = FabricaConexao.getConexao();
		
	Scanner entrada = new Scanner(System.in);

		
		
		System.out.println("Informe as iniciais que deseja procurar");
		String letras = entrada.nextLine();
		
		
		
		String sql = "select * from pessoas where nome like (?)";

		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1,"%"+ letras+"%");
		ResultSet resultado = stmt.executeQuery();

		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		
		
		while(resultado.next()) {		//resultado.next vai pegar sempre o proximo item
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCodigo()+" => " +pessoa.getNome());
		}
		
		
		
		entrada.close();
		stmt.close();
		
		
	}
	
}

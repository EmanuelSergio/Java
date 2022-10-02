package Lista9;

public class Questao3 {public static void main(String[] args) {
	
	livro livro = new livro();
	
	livro.autor = "Augusto";
	livro.idioma = "Portugues";
	livro.nome = "A busca da felicidade";
	livro.paginas = 120;
	livro.valor = 100;
	
	System.out.println(livro.nome);
	System.out.println(livro.autor);
	System.out.println(livro.idioma);
	System.out.println("Paginas " +livro.paginas);
	System.out.println("$" +livro.valor);
	
	
	
}

}

package Lista9;

public class Questao4 {

	public static void main(String[] args) {

		livro bib = new livro();
		
		bib.nome = "Percy Jackson";
		bib.autor = "grega";
		bib.paginas = 100;
		bib.idioma = "portugues";
		bib.codigo = 1564984511;
		
		System.out.println(bib.nome);
		System.out.println(bib.autor);
		System.out.println(bib.idioma);
		System.out.println("paginas "+bib.paginas);
		System.out.println("Codigo para locação " +bib.codigo);
		
		
	}

}

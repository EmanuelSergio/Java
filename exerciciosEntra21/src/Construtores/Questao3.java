package Construtores;


public class Questao3 {

	
	
	private String nome, curso;
	private int matri, media, med, med1;
	private String disciplina[] = new String[3];
	private int nota [][] = new int [disciplina.length][disciplina.length];
	
	public Questao3() {
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getMatri() {
		return matri;
	}

	public void setMatri(int matri) {
		this.matri = matri;
	}

	public int getMedia() {
		return media;
	}


	public void setMedia(int media) {
		this.media = media;
	}

	public int getMed() {
		return med;
	}

	public void setMed(int med) {
		this.med = med;
	}

	public int getMed1() {
		return med1;
	}

	public void setMed1(int med1) {
		this.med1 = med1;
	}

	public String getDisciplina(int i) {
		return disciplina[i];
	}

	public void setDisciplina(int i, String disciplina) {
		this.disciplina[i] = disciplina;
	}

	public int[][] getNota() {
		return nota;
	}

	public void setNota(int i,int j, int nota) {
		this.nota[i][j] = nota;
	}


	public void aluno () {
		
		System.out.println("");
		System.out.println("Nome: " +nome);
		System.out.println("");
		System.out.println("Matricula: " +matri);
		System.out.println("Curso: " +curso);
		
		System.out.println("Disciplinas: \n"
				+ ""
				+ "" +disciplina[0]);
		System.out.println(disciplina[1]);
		System.out.println(disciplina[2]);
	}
	
	public void media () {
		
		
	System.out.println("");
		
		
		
	for (int i = 0; i < disciplina.length; i++) {
		
		System.out.println("");
		System.out.println("Materia: " +disciplina[i]);
		
		for (int j = 0; j < disciplina.length; j++) {
			
		 media += nota [i][j]; 	
		 System.out.print(j+1 +"ª nota:");
			System.out.print(" | " +nota[i][j]+" | ");

			
		}
		
		String  med = (media/3) >= 7 ? "Aprovado" : "Reprovado";
		med1 = media/3;	
			System.out.println("Média : " +med1 +" \n"
					+ "situação: " +med);
			
		media =0;	
	}
	
		
		
		
	}
	
	
}

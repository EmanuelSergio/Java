package Construtores;

import java.util.Scanner;

public class Questao4 {

	Scanner ent = new Scanner(System.in);
	
	
	private char[][] mat = {{'1','2','3'}, {'4','5','6'}, {'7','8','9'}};
	private int cont = 0;
	private char jog;
	private char x = 'X';
	private char o = 'O';
	
	public void tabuleiro() {
		cont++;
		for (int i = 0; i < this.mat.length; i++) {
			System.out.println("---------------");
			
			for (int j = 0; j < this.mat[i].length; j++) {
				
				if(this.mat[i][j] == this.jog && this.cont % 2 == 1)
					this.mat[i][j] = 'x';
				else if(mat[i][j] == this.jog && this.cont % 2 == 0)
					this.mat[i][j] = 'o';
				
				System.out.print("| " + this.mat[i][j] + " |");
			}
			
			System.out.println("\n---------------");
		}
	}
	
	public char resultado() {
		if((mat[0][0] == mat[0][1] && mat[0][0] == mat[0][2] && mat[0][0] == 'x') ||
				(mat[1][0] == mat[1][1] && mat[1][0] == mat[1][2] && mat[1][0] == 'x') ||
				(mat[2][0] == mat[2][1] && mat[2][0] == mat[2][2] && mat[2][0] == 'x') ||
				(mat[0][0] == mat[1][0] && mat[0][0] == mat[2][0] && mat[0][0] == 'x') ||
				(mat[0][1] == mat[1][1] && mat[0][1] == mat[2][1] && mat[0][1] == 'x') ||
				(mat[0][2] == mat[1][2] && mat[0][2] == mat[2][2] && mat[0][2] == 'x') ||
				(mat[0][0] == mat[1][1] && mat[0][0] == mat[2][2] && mat[0][0] == 'x') ||
				(mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2] && mat[2][0] == 'x')) {
					return 'x';
			}else if((mat[0][0] == mat[0][1] && mat[0][0] == mat[0][2] && mat[0][0] == 'o') ||
					(mat[1][0] == mat[1][1] && mat[1][0] == mat[1][2] && mat[1][0] == 'o') ||
					(mat[2][0] == mat[2][1] && mat[2][0] == mat[2][2] && mat[2][0] == 'o') ||
					(mat[0][0] == mat[1][0] && mat[0][0] == mat[2][0] && mat[0][0] == 'o') ||
					(mat[0][1] == mat[1][1] && mat[0][1] == mat[2][1] && mat[0][1] == 'o') ||
					(mat[0][2] == mat[1][2] && mat[0][2] == mat[2][2] && mat[0][2] == 'o') ||
					(mat[0][0] == mat[1][1] && mat[0][0] == mat[2][2] && mat[0][0] == 'o') ||
					(mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2] && mat[2][0] == 'o')) {
						return 'o';
			}else if(this.cont == 10) {
				return 'e';
			}else
				return 'c';
	}
	
	public String geraResult() {
		if(resultado() == 'x') 
			return "\nO 'x' venceu!";
		else if (resultado() == 'o')
			return "\nO 'o' venceu!";
		else if(resultado() == 'e')
			return "\nEmpate!";
		else
			return "";
	}

	public void jogada() {
		lacoW: while(true) {
			if(this.cont % 2 == 1) {
				System.out.print("Informe a posição onde quer jogar (O): ");
				this.jog = this.ent.next().charAt(0);
			}else {
				System.out.print("Informe a posição onde quer jogar (X): ");
				this.jog = this.ent.next().charAt(0);
			}
			
			for (char[] cs : this.mat) {
				for (char cs2 : cs) {
					if(this.cont % 2 == 1 && cs2 == jog && jog != x)
						break lacoW;
					else if (this.cont % 2 == 0 && cs2 == jog && jog != o)
						break lacoW;
				}
			}
			System.out.println("Jogada inválida.");
		}
		
	}
	
	
	
	
	
	
}

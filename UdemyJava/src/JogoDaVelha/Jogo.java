package JogoDaVelha;


public class Jogo {

	public static void main(String[] args) {
		
		int [][] campo =  new int [2][3];
		
		for (int i = 0; i < campo.length; i++) {
				System.out.println(campo[0][i]);
			for (int j = 0; j < campo.length; j++) {
				System.out.print(campo[j][0]);
			}
		}
		
		
	}
	
	
}

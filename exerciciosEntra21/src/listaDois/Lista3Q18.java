package listaDois;
import java.util.Scanner;
public class Lista3Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anoAtual, nasc, anos;
		Scanner read = new Scanner(System.in);
		System.out.println("digite o ano do nascimento");
		nasc = read.nextInt();
		System.out.println(nasc);
		System.out.println("Digite o ano atual");
		anoAtual = read.nextInt();
		anos = anoAtual-nasc;
		System.out.println("Sua idade é: " +anos);
		
		read.close();
		
		
	}

}

package listaDois;
import java.util.Scanner;
public class exercicio8 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	String nome;
	float vm, vtempo, vdistancia;
	
	System.out.println("Digite o nome do piloto");
	nome = leia.nextLine();
	System.out.println("digite a distancia percorrida em KM ");
	vdistancia = leia.nextFloat();
	System.out.println("Digite o tempo de voo em horas");
	vtempo = leia.nextFloat();
	vm = vdistancia/vtempo;
	System.out.println("A velocidade média de " +nome +" foi de " +vm +" km/h");
	
	
	
	leia.close();
	
	
	
	
	
	
	
	
	
}

}

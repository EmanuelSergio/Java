package listaDois;
import java.util.Scanner;
public class Exercicio10 {public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	String nome;
	double salario;
	int nfilhos, trhoras;
	float vhora;
	
	System.out.println("####################################################");
	
	System.out.println("Digite o nome do funcionário");
	nome = read.nextLine();
	
	System.out.println("Digite a quantidade de horas trabalhadas pelo funcionário");
	trhoras = read.nextInt();
	
	System.out.println("Digite o valor da hora de trabalho do funcionário");
	vhora = read.nextFloat();
	
	System.out.println("Se possuir filhos, informe quantos");
	nfilhos = read.nextInt();
	
	salario = (vhora*trhoras) + (nfilhos*0.03*vhora*trhoras);
	
	System.out.println("O salario total de " +nome +" é de $" +salario);
	
	System.out.println("######################################################");
	
	
read.close();

	
	
	
	
	
	
	
	
}

}

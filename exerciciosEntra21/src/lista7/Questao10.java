package lista7;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);

float[] a = new float[10];
float[] b = new float[a.length];
float[] tot = new float[a.length];
int bi=1, aluno=0;
String fim;
float med=0, med1=0;

for (int i = 0; i < a.length; i++) {
System.out.println((i+1) +"º aluno");
System.out.println("Informe a nota do " +bi +"º bimestre");
a[i] = leia.nextFloat();
bi++;
System.out.println("Informe a nota do " +bi +"º bimestre");	
b[i] = leia.nextFloat();	
bi--;

med=a[i]+b[i];
med1=med/2;

tot[i]=med1;


}

for (int i = 0; i < tot.length; i++) {
	aluno++;
	fim = (tot[i] < 7)? aluno +"º aluno Reprovado" : aluno +"º aluno Aprovado";

	System.out.println(fim);

	
	
}






leia.close();
		
		
	}

}

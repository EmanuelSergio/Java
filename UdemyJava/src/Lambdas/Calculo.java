package Lambdas;

@FunctionalInterface //for�a a ter apenas um m�todo
public interface Calculo {

	 double executar(double a, double b);
	
	 default String legal() {
		 return "legal";
	 }
	 
	 static String massa() {
		 return "massa!!!";
	 }
	 
	 
	 
	 
}

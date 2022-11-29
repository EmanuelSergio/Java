package Lambdas;

@FunctionalInterface //força a ter apenas um método
public interface Calculo {

	 double executar(double a, double b);
	
	 default String legal() {
		 return "legal";
	 }
	 
	 static String massa() {
		 return "massa!!!";
	 }
	 
	 
	 
	 
}

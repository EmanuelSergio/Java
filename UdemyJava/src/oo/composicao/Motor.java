package oo.composicao;

public class Motor {

	double fatorInjecao=1;
	boolean ligado=false;
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao*3000);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

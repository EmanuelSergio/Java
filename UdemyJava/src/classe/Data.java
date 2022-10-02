package classe;

public class Data {

	int dia, mes, ano;
	
	
	Data(int dia,int mes, int ano){
		
	}
	
	
	
	
	
	
	String obterDataFormatada(int dia, int mes, int ano) {
		
		return dia+"/"+mes+"/"+ano;
	}
	
	//ou :
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
}

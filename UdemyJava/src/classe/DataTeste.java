package classe;

public class DataTeste {public static void main(String[] args) {
	
	Data d1 = new Data(05, 10, 2005);
	var d2 = new Data(04, 10, 2005);
	
	d1.dia = 04;
	d1.mes = 10;
	d1.ano=2005;

	d2.dia = 21;
	d2.mes = 01;
	d2.ano=1985;
	
	System.out.printf("%d/%d/%d ", d1.dia, d1.mes, d1.ano);
	System.out.printf("\n%d/%d/%d", d2.dia, d2.mes, d2.ano);
	
	d1.obterDataFormatada(12, 10, 2022);
	System.out.println("\n" +d1.obterDataFormatada(12, 10, 2022));
	
	//ou:
	
	System.out.println(d2.obterDataFormatada());
	
	
	
	
	
	
}

}

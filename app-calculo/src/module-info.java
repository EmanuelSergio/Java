 module app.calculo {
	
	exports br.com.emanuel.app.calculo;
	requires transitive app.logging;
	
	
	exports br.com.emanuel.app.calculo.interno
		to app.financeiro, app.logging;
	
	opens br.com.emanuel.app.calculo to app.financeiro;
}
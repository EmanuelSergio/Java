package excecao;

public class ChecadaVsNaoChecada {
public static void main(String[] args) {
	
	
	try {
		geraErro1();
		
	} catch (RuntimeException e) {
		System.out.println(e.getMessage());
	}
	
	geraErro2();
	
	
	
	try {
		geraErro3();
	} catch (Throwable e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println("FIM");
	
}




//=======================================================//





//excecao nao checada ou nao verificada
static void geraErro1() {
	throw new RuntimeException("Ocorreu um erro bem legal #01!!");
}

//excecao checada ou verificada
static void geraErro2()  {
	try {
	 throw new Exception("Ocorreu um erro bem legal #02");
		
	} catch (Exception e) {
		System.out.println("Que legal #03");
	}
}

static void geraErro3() throws Exception  {
	 throw new Exception("Ocorreu um erro bem legal #03");

}




}

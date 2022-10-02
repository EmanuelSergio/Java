package OOP4;

public class Main_Conversao {public static void main(String[] args) {
	
	Conversao conv = new Conversao();
	
	System.out.println(conv.segundos(2) +" segundos");
	System.out.println(conv.hora(3) +" minutos");
	System.out.println(conv.dia(5) +" horas");
	System.out.println(conv.semana(4) +" dias");
	System.out.println(conv.mes(3) +" dias");
	System.out.println(conv.ano(5) +" dias");
}

}

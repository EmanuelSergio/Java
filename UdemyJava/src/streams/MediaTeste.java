package streams;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media n1 = new Media().adicionar(8.3).adicionar(6.7);
		Media n2 = new Media().adicionar(7.9).adicionar(6.6);

		
		System.out.println(n1.getValor());
		System.out.println(n2.getValor());
	
		System.out.println(Media.combinar(n1, n2).getValor());
		
		
		
	}
	
	
}

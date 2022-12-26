package Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("Js", "PHP", "JS");
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
		
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
		
		System.out.println(ultimoNumero);
		
		
		String ultimaLinguagem2 =  ListaUtil.getUltimo2(langs);
		
		System.out.println(ultimaLinguagem2);
		
		
		//para especificar ainda maiss:
		Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
		
		System.out.println(ultimoNumero2);
		
	}

	
	
	
	
}

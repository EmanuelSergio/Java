package Annotations;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Teste {public static void main(String[] args) {
	

	Usuario usuario = new Usuario("Bruno", 798654, LocalDate.of(2005, Month.JANUARY, 13));
	System.out.println(validador(usuario));
	
	
	
	
	
}

public static <T> boolean validador(T objeto) {
	Class<?> classe = objeto.getClass();
	 for (Field field: classe.getDeclaredFields() ) {
		 if(field.isAnnotationPresent(IdadeMinima.class)) {
			 IdadeMinima idadeMinima = field.getAnnotation(IdadeMinima.class);
			try {
				field.setAccessible(true);
				LocalDate dataNascimento = (LocalDate) field.get(objeto);
				return Period.between(dataNascimento, LocalDate.now()).getYears() >= idadeMinima.valor();
			}catch (IllegalAccessException e) {
			e.printStackTrace();
			}
			
		 }
		 
	 }
	 return true;
	
}





}

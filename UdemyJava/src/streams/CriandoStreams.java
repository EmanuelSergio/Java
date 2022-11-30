package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<Object>print = System.out::println;
		
		
		Stream<String> langs = Stream.of("JAVA ","LUA ","JS\n");
		
		langs.forEach(print);
		
		String[] maisLangs = {"Python ","Lisp ","Perl ","Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1,3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("\nC ","php ","Kotlin\n");
		outrasLangs.stream().forEach(print);
		System.out.println("------------------");
		outrasLangs.parallelStream().forEach(print);
		
	//	Stream.generate(()->"a").forEach(print);
		
		Stream.iterate(0, n -> n+1).forEach(print);
		
		
		
	}
	
}

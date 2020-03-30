package basics;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSource {

	public static void main(String[] args) {
		
		String a="ball";
		String b ="delta";
		String c="apple";
		System.out.println(Stream.of(a,b,c).min(Comparator.naturalOrder()));
		

	}
	
	

}

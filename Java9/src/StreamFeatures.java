
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFeatures {

	public static void main(String[] args) {
		Stream<Integer> numbers  =Stream.of(8,4,6,4,1,3,8,9);
		System.out.println(
				numbers
				//.filter(i->i<5)
				//.takeWhile(i->i<5)
				//.dropWhile(i->i<5) //[8, 4, 6, 4, 1, 3, 8, 9] //from condition met everything will be taken
				.collect(Collectors.toList()) 
				);
		
		
		
	}

}

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ImmutableSet {

	public static void main(String[] args) {
		
		Set<String> set =Set.of("ab","bc" ,"cd");
		
		System.out.println(set);
		System.out.println(
				set.stream()
				.filter(s->s.contains("b"))
				.collect(Collectors.toSet())
				
				);
		
		//set.add("ef"); additon removal not allowed
	}
	
	
	
	



}

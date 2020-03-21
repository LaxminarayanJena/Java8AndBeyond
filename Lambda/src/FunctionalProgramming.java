import java.util.ArrayList;
import java.util.List;

public class FunctionalProgramming {
/*
 * its a way of building software by using pure functions and by avoiding shared state and side effects
 * shared state- a variable being acccesed by more than 1 function
 * side effect: function modifies the variable
 * f(x)=x+3
 */
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("");
		list.add("ddd");
		
		
		GreetingService g3= (n) -> {
			//list.remove(1)
			return n.toUpperCase() + list.get(1);
		
			};
			System.out.println(g3.greet("jenalaxminarayan"));
	}
}

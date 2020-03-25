import java.util.function.Function;

//used for transformation

public class FunctionInterface {

	public static void main(String[] args) {
		

		Function<String,Integer> strlen =(s) ->s.length();
		Function<Integer,Integer> square =(i) ->i*i;
		
		System.out.println(
				
				strlen.andThen(square).apply("hi good morning")
				);
		
	}

}

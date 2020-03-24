import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateInterface {

	public static void main(String[] args) {
		Predicate<Integer> isGT2 = (n) -> n>2;
		Predicate<Integer> isLT10 = (n) -> n<10;
		
		System.out.println(
				
				//isGT2.test(5)  //true
				//isGT2.test(1)  //false
				//isLT10.test(1)//true
				//isGT2.and(isLT10).test(5)//TRUE
				isGT2.negate().test(3)//FALSE
				);
		

	}

}

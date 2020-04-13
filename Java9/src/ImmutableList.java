import java.util.Arrays;
import java.util.List;

public class ImmutableList {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(1,2,3,5,null);
		System.out.println(list);
		
		
		List<Integer> list1 =List.of(1,2,3,5); //null not allowed //no elements addition,removal allowed
		System.out.println(list1);

	}
	
	



}

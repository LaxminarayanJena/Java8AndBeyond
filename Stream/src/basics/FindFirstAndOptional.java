package basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindFirstAndOptional {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("ball");
		list.add("cat");
		list.add("dog");

		Optional<String> op = list.stream()
				.filter(s -> s.length() > 3)
				.findFirst();

		if (op.isPresent()) {
			System.out.println(op.get());
		}

		
		
		System.out.println(list.stream()
				.filter(s -> s.length() > 3)
				.findFirst());

		

		
		System.out.println(list.stream()
				.filter(s -> s.length() > 3)
				//.max(Comparator.reverseOrder())
				.max(Comparator.naturalOrder())
				.get());

	
		
		
		
		System.out.println(list.stream()
				.filter(s -> s.length() > 3)
				.anyMatch(s ->s.contains("e"))
				
				);
		
		System.out.println(list.stream()
				.filter(s -> s.length() > 3)
				.noneMatch(s ->s.contains("e"))
				
				);
	}
	
	
	

}

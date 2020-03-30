package terminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperations {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("ball");
		list.add("ball");
		list.add("cat");
		list.add("dog");
		list.add("bangalore");


		List<String> newList =list.stream()
				.filter(s->s.length()>3)
				.collect(Collectors.toList());
		System.out.println("original" +"::"+list);
		System.out.println("New List" +"::"+newList);
		
		
		
		Set<String> newSet=list.stream()
				.filter(s->s.length()>3)
				.collect(Collectors.toSet());
		System.out.println("original" +"::"+list);
		System.out.println("New List" +"::"+newSet);
		
		
		String joinedString=list.stream()
				.filter(s->s.length()>3)
				.collect(Collectors.joining(";"));
		System.out.println(joinedString);

		
		Map<Character,List<String>> map=list.stream().collect(Collectors.groupingBy(s->s.charAt(0)));
		System.out.println(map);
	}

}

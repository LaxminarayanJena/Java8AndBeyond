package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfTwoNos {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,2,3,4,5,6,7);
		
		int sum=list.stream()
				.mapToInt(a ->a) //reference type converting to primitve type
				.sum();
		System.out.println(sum);
	}

}

/*

Integer x=5;
int y=x;   converting reference type to integer type
*/
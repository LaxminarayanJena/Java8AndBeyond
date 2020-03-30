package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class InStreamForLoop {

	public static void main(String[] args) {
		
		IntStream.rangeClosed(1,10)
		.forEach(i->System.out.println(i));

	}

}

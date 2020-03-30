package basics;

import java.util.ArrayList;
import java.util.List;

//A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result. The features of Java stream are – A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.

public class SqaureOfEvenNo {

	public static void main(String[] args) {

List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);
list.add(7);

list.stream().filter(i->i%2==0).limit(3).map(i->i*i).forEach(i ->System.out.println(i));
	}

}

//check for even numbers
//intrested in only 3 elements
//find the square
//print it on console one by one
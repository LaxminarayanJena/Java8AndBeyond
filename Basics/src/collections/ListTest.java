package collections;

import java.util.ArrayList;
import java.util.List;

import polymerphisim.Animal;
import polymerphisim.Cat;
import polymerphisim.Dog;

public class ListTest {

	public static void main(String[] args) {
		
		Dog d= new Dog();
		Cat c = new Cat();
		List<Animal> l = new ArrayList<Animal>();
		List<Integer> l1= new ArrayList<Integer>();
		l1.add(1);
		int no= 50;
		Integer refno= no;//boxing  //convert integer to intger reference type
		int refno1= refno;//unboxing assigning reference to primitive type
		l.add(d);
		l.add(c);
	}
	

}

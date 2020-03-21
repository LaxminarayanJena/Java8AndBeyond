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
		l.add(d);
		l.add(c);
	}
	

}

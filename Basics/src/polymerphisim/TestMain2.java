package polymerphisim;

public class TestMain2 {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		test(a);
		a= new Cat();
		test(a);
		a=new Horse();
		test(a);
				
	}

	
	private static void test(Animal d)
	{
		d.makeSound();
		d.walk();
	}
	
	
}

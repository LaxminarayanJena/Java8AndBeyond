package polymerphisim;

public class TestMain {

	public static void main(String[] args) {
		AreaCalculator a= new AreaCalculator();
		System.out.println(a.getArea(5));
		System.out.println(a.getArea(5.25));
		System.out.println(a.getArea(5, 7));
	}

}

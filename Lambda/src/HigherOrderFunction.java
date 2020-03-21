
public class HigherOrderFunction {

	public static void main(String[] args) {
		
		GreetingService g1 = (n) -> n.toUpperCase();
		test(g1);
		test((n)->n.toUpperCase()+n.toLowerCase()+n.length());
		test(a->a.replace("a", "b"));

	}
	
	private static void test(GreetingService g)
	{
		String returnedString = g.greet("jenaaaaa");
		System.out.println(returnedString);
	}

}

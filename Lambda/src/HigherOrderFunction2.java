
public class HigherOrderFunction2 {

	public static void main(String[] args) {
		//convertToUppercase("sam");
		//convertToLowercase("ram");
		
		test(n ->n.toUpperCase());
		test(n->n.toLowerCase());
	}
	
	/*
	private static void convertToUppercase(String s)
	{
		String returnedString =s.toUpperCase();
		System.out.println(returnedString);
	}
	private static void convertToLowercase(String s)
	{
		String returnedString =s.toLowerCase();
		System.out.println(returnedString);
	}
	*/
	private static void test(GreetingService g)
	{
		String returnedString = g.greet("udemy");
		System.out.println(returnedString);
	}

}

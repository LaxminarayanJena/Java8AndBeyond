
public class LambdaExecutionOrder {

	public static void main(String[] args) {
		System.out.println("starting execution");
		
		//giving behaviour
		test(n ->
		{
			System.out.println("inside lambda");
			return n.toUpperCase();
		});
		System.out.println("ending execution");
	}
	
	private static int getNumber(int i)
	{
		System.out.println("calling get no");
		return 5;
	}
	
	private static void receiveNumber(int i)
	{
		System.out.println("received no is "+i);
	}
	private static void test(GreetingService g)
	{
		System.out.println("inside test method.received greeting service");
		String returnedString = g.greet("udemy");
		System.out.println(returnedString);
	}

}


public class HigherOrderFunction3 {

	public static void main(String[] args) {
		
	String ss= getLambda().greet("data");
	System.out.println(ss);
	}
	
	private static void test(GreetingService g)
	{
		g.greet("");
		System.out.println("inside test method.Received greeting service");
	}

	private static GreetingService getLambda()
	{
		return(s) ->s.toUpperCase();
	}
}

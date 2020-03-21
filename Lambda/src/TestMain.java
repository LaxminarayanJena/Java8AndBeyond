
public class TestMain {

	public static void main(String[] args) {
		/*
		
		GreetingService g1= new GreetingService()
		{

			@Override
			public void greet(String name) {
				System.out.println("hi "+ name);
				
			}
	
		};
		*/		
				/*GreetingService g2= (String name) -> System.out.println("hi"+ name);
				g2.greet("jena");
				*/
				////////////////////////////////////////
				
/*
				GreetingService g3= (name) -> {
				System.out.println("uppercase-"+ name.toUpperCase());
				System.out.println("lowercase-"+ name.toLowerCase());
				};
				g3.greet("jenalaxminarayan");
			*/	
				//////////////////////////////////////////
				
				GreetingService g4= (n) -> n.toUpperCase();
				
				System.out.println(g4.greet("jenaaa"));
				
				
	}
}

//Lambda expression is an implementation of interface.it should have only one abstract method

public class RunnableInterface {
	
	
	public static void main(String[] args) {
	
		/*
		Runnable r=()->System.out.println("hello world");
		r.run();
		*/
		
		Runnable r=() ->
		{
			System.out.println("hello world");
		};
		//above block is executed asychronously
		
		new Thread(r).start();
		System.out.println("hi");
	}

}

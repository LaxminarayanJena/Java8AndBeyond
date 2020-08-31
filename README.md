### Lambda Expression
A Lambda expression (or function) is an anonymous function, i.e., a function with no name and any identifier. </br>
		(parameters) -> expression

```
		IntStream.rangeClosed(1, 10).forEach(System.out::println);

		// -----------------------------------

		IntStream.rangeClosed(1, 10).forEach(a -> {
			System.out.print(a + ",");
		});

		// -----------------------------------
		IntStream.range(0, 5)
				// .filter(p -> p % 2 == 0)
				.mapToLong(p -> (long) Math.pow(p, 2)).forEach(p -> {
					System.out.print(p + ",");

				});

		// ------------------------
		((Runnable) () -> {

			int a = 50;
			int c = 200;
			System.out.println(a * c);

		}).run();

		// --------------------

		List<String> myList = new ArrayList();

		myList.add("1");
		myList.add("2");

		myList.forEach(p -> {
			System.out.println(p);
		});
    
```
### Functional Programming
 permit exactly one abstract method inside them. 
```
@FunctionalInterface
interface EvenOdd {
	void check(int a);
	
	//single abstract method
	//static and default method with body allowed
	
}

public class LambdaExample2 {
	public static void main(String[] args) {

		EvenOdd evenOdd = (int a) -> {
			if (a % 2 == 0) {
				System.out.println("Number " + a + " is even.");
			} else {
				System.out.println("Number " + a + " is odd.");
			}
		};

		evenOdd.check(8); //even
	//-------------------------------------------	
		
		EvenOdd square = (int a) -> {
			System.out.println(a*2);
		};
		
		square.check(5); //10
		//-------------------------------------------		
		
		EvenOdd displayno = (int a) -> {
			for(int i=0; i<=a;i++)
			{
				System.out.print(i +",");
			}
		};
		
		displayno.check(10); //1,2,3....10
		
		
		
	}
}
```
### Stream
A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
```
   List<Integer> list = Arrays.asList(3, 6, 9, 12, 15); 
   list.stream().map(number -> number * 3).forEach(System.out::println); 
```

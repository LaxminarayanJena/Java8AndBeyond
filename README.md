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


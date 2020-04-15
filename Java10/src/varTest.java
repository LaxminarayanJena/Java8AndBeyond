
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class varTest {

	public static void main(String[] args) {
    test();
	}
	
	
	private static void test()
	{
		/* should be written inside a body 
		 * will not allow below things
		 var a;
		 a=10;
		 var a= null;
		 var test()
		 var cant be used in lambda declaration
		 var at= (i) -> System.out.println(i+i); unable to find which implementation of interface
		 */
		
		int var=11;
		var num=10;
		var list =List.of(1,2,4,5);
		var map =Map.of("name1", 12 , "name2", 20);
		var list1 = new ArrayList<Integer>();
		System.out.println(var);
		/*
		 Optional<List<WebElement>> can be replaced to var
		 <List<WebElement> can be replaced to var
		 String[]
		  can be replaced to var
		 * 
		 */
	}
	

}

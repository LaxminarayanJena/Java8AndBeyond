package collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		findMax(3 , 8 , 2);
	}
	
	//private static void findMax(int a , int b , int c)
	private static void findMax(int a , int b , int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		
		else if(b>a && b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}

}

package datatype;

import java.util.Arrays;

public class MutationAvoiding {
//changing the original object state inside the method in such a way that it could lead to unexpected result
	
	public static void main(String[] args) {
		
		int[] arr= new int[] {1,2,4};
		predict(arr);
		totalSale(arr) ;
		//totalSale(arr) ; 7
	}
	
	private static void predict(int[] a)
	{
		a[0]++;
		a[1]++;
		System.out.println("prediction for next month:"+(a[0]+ a[1]+a[2]) );
	}
	
	public static void totalSale(int[] a) 
	{
		System.out.println("Total sale for this month :" +(a[0]+ a[1]+a[2]));
	}

}

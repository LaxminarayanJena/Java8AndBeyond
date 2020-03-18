package datatype;

import java.util.Arrays;

public class ReferenceType {

	public static void main(String[] args) {
		//int[] arr= {1,2,3};
		int[] arr= new int[] {1,2,9};
		//abc123
		
		
		System.out.println("Before::"+Arrays.toString(arr));
		change(arr);
		System.out.println("After::"+Arrays.toString(arr));
		
		
		

	}
	
	public static void change(int[] a) //abc123
	{
		//a= new int[] {1,2,9};  //o/p same  //create a new array
		a[0]++;//a[0]=a[0]+1
		a[1]++;
		a[2]++;
	}

}

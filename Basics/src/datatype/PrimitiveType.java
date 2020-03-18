package datatype;

public class PrimitiveType {

	public static void main(String[] args) {
		int i=5;
		System.out.println("before-"+ i);
		change(i);
		System.out.println("after-"+ i);
	}

	private static void change(int a)
	{
		a++;
	}
}

//java is pass by value. we are passing reference by value
 //o/p same
package calculator;

public class TestMain {

	public static void main(String[] args) {
		
		MathOperation add =(a,b) ->a+b;
		MathOperation sub =(a,b) ->a-b;
		MathOperation mult =(a,b) ->a*b;
		MathOperation div =(a,b) ->a/b;

		System.out.println(calculate(add));
		System.out.println(calculate(sub));
		System.out.println(calculate(mult));
		System.out.println(calculate(div));
	}
	
	private static int calculate(MathOperation mathoperation)
	{
		
		int a =100;
		int b=5;
		
		return mathoperation.operate(a, b);
		
	}

}

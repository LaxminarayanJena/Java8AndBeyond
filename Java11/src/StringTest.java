import java.util.stream.Collectors;

public class StringTest {

	public static void main(String[] args) {
		
		//isBlank
		String s= " ";
		System.out.println(s.isEmpty()); //false
		System.out.println(s.isBlank()); //true
		
		
		//lines
		String str= "hi\nhelllo\nhowareyou?";
		var list =str.lines()
				.collect(Collectors.toList());
		System.out.println(list);  //[hi, helllo, howareyou?]
		
		//repeat
		String str1= "tom";
		System.out.println(str1.repeat(5));  //tomtomtomtomtom
		
		//strip
		char c= '\u2002';
		String str2= c + " udemy " + c;
		System.out.println("::" + str2.strip() + "::"); //::udemy::
		System.out.println("::" + str2.stripLeading() + "::"); //::udemy ?::
		System.out.println("::" + str2.stripTrailing() + "::"); //::? udemy::

	}

}

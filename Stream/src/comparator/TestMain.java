package comparator;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TestMain {

	public static void main(String[] args) {
		Student a= new Student("adam", 80, 100);
		Student b= new Student("bom", 40, 200);
		Student c= new Student("tom", 30, 300);
		
		Optional<Student> op=Stream.of(a,b,c)
		.min(Comparator.comparing(s -> s.getHeight()));
		System.out.println(op.get());
	}

}

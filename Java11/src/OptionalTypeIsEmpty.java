import java.util.List;
import java.util.Optional;

public class OptionalTypeIsEmpty {

	public static void main(String[] args) {
		
		var list = List.of(1,2,3,4);
		
		Optional<Integer> op=list.stream().filter(i->i>5).findFirst();
		System.out.println(op.isEmpty());
	}

}

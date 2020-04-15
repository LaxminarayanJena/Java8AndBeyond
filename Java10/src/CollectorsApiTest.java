
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsApiTest {

	public static void main(String[] args) {
		var list = List.of(1, 2, 3, 4, 5);
		var newlist=list.stream().filter(i -> i % 2 == 0).collect(Collectors.toUnmodifiableList());
		newlist.add(8);
		//Exception in thread "main" java.lang.UnsupportedOperationException
	}

}

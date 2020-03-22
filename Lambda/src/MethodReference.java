import java.util.ArrayList;
import java.util.List;

public class MethodReference {
	
	private static final List<String> list =  new ArrayList<>();
	

	public static void main(String[] args) {
	
     StringOperations op1 = list::add;
     op1.accept("jena");
    System.out.println(list);
	}

}

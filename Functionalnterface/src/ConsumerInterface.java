

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("jena");
		list.add("narayan");
		
		Consumer<String> c1=(s)->System.out.println(s);
		list.forEach(c1);
		
		Consumer<String> dbConsumer=(s)->
		{
		System.out.println("i am writing into DB::"+s);
		
		
		};
		Consumer<String> loggingConsumer=(s)->
		{
		System.out.println("i am writing into logfile::"+s);
		
		};
		
		Consumer<String> dbLogConsumer=  dbConsumer.andThen(loggingConsumer);
		
		
	}

}

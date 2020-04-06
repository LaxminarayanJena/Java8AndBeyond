import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FirstNameFileProcessing {

	public static void main(String[] args) throws IOException {
		
		Path path =Paths.get("D:\\Projects\\Java8&Beyond\\Assignment\\src\\first-names.txt");
        List<String> list = Files.readAllLines(path);
        
        //print the count of names which start with B
        System.out.println(
        		list.stream()
        		.filter(name -> name.startsWith("B"))
        		.count()
        		);
        
        //create a list of names which start with C and contains 's' in it
        List<String> names=list.stream()
        .filter(name ->name.startsWith("C"))
        .filter(name->name.contains("s"))
        .collect(Collectors.toList());       
        System.out.println(names.size());
        
        
  //print the total no of chars for all the names start with M      
        //mary,Mike =>8
        System.out.println(
        		list.stream()
        		.filter(name->name.startsWith("M"))
        		.map(String::trim)
        		.map(String::length)
        		.mapToInt(i->i)
        		.sum()
        		);
	}

}

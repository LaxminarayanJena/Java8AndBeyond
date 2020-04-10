package tests;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
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
        
        //JO-Ann =>JoAnn
        //find the names containing - in it and replace it with a space ; collect them into a list
       
     
        System.out.println(
        		list.stream()
        		.filter(name->name.contains("-"))
        		.map(name->name.replaceAll("-", ""))
        		.collect(Collectors.toList())
        		);
        
        //find the name which has more no of chars
        System.out.println(
        	list.stream()
        	.max(Comparator.comparing(s ->s.length()))
        	.get()
        		);
	}

}

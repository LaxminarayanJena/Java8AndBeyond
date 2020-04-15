import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileApiReadAndWrite {

	public static void main(String[] args) throws IOException {
	Path path =Paths.get("D:\\Projects\\Java8&Beyond\\Java11\\src\\demo11.txt");
	Files.writeString(path, "laxminarayan jena");
	System.out.println(Files.readString(path));

	}

}

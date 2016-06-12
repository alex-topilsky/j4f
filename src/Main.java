import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("Hello");
		//Generate.show();
		Runnable r1 = () -> Stream.generate(() -> Math.random()).forEach(System.out::println);
		Runnable r2 = () -> Stream.generate(() -> (Math.random() + 5)).forEach(System.out::println);
		
		//new Thread(r2).start();
		//new Thread(r1).start();
		
		try {
			Files.list(Paths.get("."))
			.map(Path::getFileName) // still a path
			.map(Path::toString) // convert to Strings
			.filter(name -> name.endsWith(".java"))
			.sorted() // sort them alphabetically
			.limit(5) // first 5
			.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		list.stream().map((x) -> x*x).forEach(System.out::println);
		
	}

}

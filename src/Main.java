import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		//Generator.show();
		Runnable r = () -> System.out.println("hello world");
		Runnable r2 = () -> Stream.generate(() -> (Math.random() + 5)).forEach(System.out::println);
		Runnable r1 = () -> Stream.generate(() -> Math.random()).forEach(System.out::println);
		new Thread(r1).start();
		new Thread(r2).start();	
		
	}

}

import java.util.stream.Stream;

public class Generator {
	
	public static void show() {
		Stream.generate(() -> Math.random()).forEach(System.out::println);
	}

}

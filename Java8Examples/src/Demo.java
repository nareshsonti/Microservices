import java.util.Arrays;
import java.util.List;

public class Demo {
	
	static int i = 0;

	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		myList.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		// Using Method reference to call system.out.println()
		myList.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
		myList.stream().forEach(s -> System.out.println("Hi "+s));
	}
}

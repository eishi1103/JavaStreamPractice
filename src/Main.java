import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//		IntStream
		//				.range(1, 10)
		//				.forEach(System.out::print);
		//
		//		System.out.println();

		List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");

		List<String> sortedResult = names.stream().sorted().toList();
		long count = names.stream().filter(name -> name.startsWith("y")).count();
		boolean hasYamada = names.stream().anyMatch(name -> name.equals("yamada"));

		System.out.println(sortedResult);
		System.out.println(count);
		System.out.println(hasYamada);

		names.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));

		Arrays.stream(new int[] { 2, 4 })
				.map(x -> x * x)
				.average()
				.ifPresent(System.out::println);

		System.out.println();

	}

}

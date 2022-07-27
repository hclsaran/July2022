package com.java8;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		// Integer Stream
		IntStream.range(1, 10).forEach(System.out::println);
		System.out.println();

		// Integer Stream with skip
		IntStream.range(1, 10).skip(5)
				/*
				 * .forEach(System.out::println); System.out.println();
				 */
				.forEach(x -> System.out.println(x));
		System.out.println();
		System.out.println(IntStream.range(1, 5).sum());

		Stream.of("Abc", "Def", "Ghi").sorted().findFirst().ifPresent(System.out::println);

		String[] names = { "Behar", "Mohit", "Mani", "Shashank", "Saran", "Bryan", "Maya" };

		Arrays.stream(names) // almost equal to Stream.of()
				.filter(x -> x.startsWith("M")).sorted().forEach(System.out::println);
		System.out.println("________________________________________________________________________");
		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
		bands.sorted().filter(x -> x.length() > 10).forEach(System.out::println);
		bands.close();
		System.out.println("________________________________________________________________________");
		List<String> bands2 = Files.lines(Paths.get("bands.txt")).filter(x -> x.contains("jit"))
				.collect(Collectors.toList());
		bands2.forEach(System.out::println);

	}

}

package com.java.stream;

import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerate {

	public static void main(String[] args) {

		
Stream.generate(()-> new Random().nextInt(100)).filter(i -> i % 2 != 0)
               .limit(10).forEach(i -> System.out.print(i+" "));

Stream.generate(()-> new Random().nextInt(100)).filter(i -> i <= 50).limit(23).forEach(System.out::println);
//.takeWhile(i -> i <= 50).forEach(System.out::println);

	}

}

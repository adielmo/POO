package com.java.checkList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateList {

	public static void main(String[] args) {
List<Integer> integers = Arrays.asList(12, 10, 415, 10, 5, 50, 25, 12, 50);
List<Integer> numer = Arrays.asList(12, 10, 415, 19, 58, 55, 23, 2, 63);
int[] numeros = new  int[] {12, 10, 415, 10, 5, 50, 25, 12, 50};

List<Integer> duplicidadeArray = isRemoveDuplicidadeArray(numeros);

List<Integer> duplicidadeList = isRemoveDuplicidadeList(integers);

integers.stream().sorted().forEach(x -> System.out.print(x+", "));
System.out.println("Ixiste Duplicidade list: "+isDuplicidadeList(integers));
System.out.println("=================//=====================");
numer.stream().sorted().forEach(x -> System.out.print(x+", "));
System.out.println("Ixiste Duplicidade list: "+isDuplicidadeList(numer));

System.out.println("=================//=====================");




duplicidadeList.forEach(num -> {
	System.out.print(num+ ", ");
});

System.out.println();

duplicidadeArray.forEach(num -> {
	System.out.print(num+ ", ");
});


		

	}

	private static boolean isDuplicidadeList(List<Integer> integers) {
		return integers.stream().distinct().count() != integers.size();
		
	}

	private static List<Integer> isRemoveDuplicidadeArray(int[] numeros) {
		return Arrays.stream(numeros).boxed()
				        .distinct().sorted()
				        .collect(Collectors.toList());
		
	}

	private static List<Integer> isRemoveDuplicidadeList(List<Integer> integers) {
		return integers.stream().distinct().sorted().collect(Collectors.toList());
		
	}

}

package com.java.streamMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TesteBook {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
		bookList.add(new Book("The Two Towers", 1954, "0345339711"));
		bookList.add(new Book("The Return of the King", 1955, "0618129111"));
		bookList.add(new Book("The Quarkus", 2018, "44654351532"));
		bookList.add(new Book("The Two Java", 2015, "354225454"));
		bookList.add(new Book("The Spring Boot", 2020, "14314313213"));
		
		Map<String, String> listToMap = listToMap(bookList);
		
		listToMap.entrySet().forEach(x ->{
			System.out.println("Key: "+x.getKey()+" Value: "+x.getValue());
		});
		
		

	}
	
	public static Map<String, String> listToMap(List<Book> books){
		return books.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));
	}

}

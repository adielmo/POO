package com.java.streamMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Teste01 {

	public static void main(String[] args) {
		
		Map<String, String> books = new HashMap<>();
		
books.put("978-0201633610", "Design patterns : elements of reusable object-oriented software");
books.put("978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
books.put("978-0134685991", "Effective Java");

String valueBusca = "Java 8 in Action";

Optional<String> optionalIsbn = books.entrySet().stream()
.filter(e -> valueBusca.equals(e.getValue()))
.map(Map.Entry::getKey)
//.map(x -> x.getKey())
//.map(Map.Entry :: getValue)
.findFirst();


 System.out.println(optionalIsbn.isPresent() ? optionalIsbn.get() : optionalIsbn.orElse("Vázio"));


				
				
		
		
		
	}

}

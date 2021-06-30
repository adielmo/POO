package com.java.optional;

import java.util.Optional;
/**
 * 
 * @author Adielmo
 *
 */

public class OptionalNull {

	public static void main(String[] args) {

Cliente c1 = new Cliente(1L, "Arthur", "018.982.872-09", "arthur@gmail.com");
Cliente c2 = new Cliente(1L, "Joilma", "018.982.872-09", null);//"joilma@gmail.com" nome@gmail.com

Optional<String> email = Optional.ofNullable(c2.getEmail());
Optional<String> emailArthur = Optional.ofNullable(c1.getEmail());

emailArthur.filter(i -> i.equalsIgnoreCase("arthur@gmail.com.br")).ifPresent(System.out::printf);
System.out.println("\n-------------//---------------------");
System.out.println("Cliente 01: " + c1.getEmail());
System.out.println("Cliente 01: " + emailArthur.get());
System.out.println("Email: " + email.orElse("nome@gmail.com"));
//System.out.println("Email: " + email.orElseThrow(() -> new IllegalArgumentException("Error!!")));
//System.out.println("Email: " + email.orElse("nome@gmail.com"));
System.out.println("Cliente 02: " + email.map(String::toLowerCase).orElseGet(()->"Não tem E-mail"));

/*
 * if (email.isPresent()) { System.out.println(email.get()); }
 */


		
	}

}

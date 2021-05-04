package com.java.optional;

import java.util.Optional;

public class TesteOptional {

	public static void main(String[] args) {
  Cliente cliente =new Cliente(5L, "Adielmo", "018-650-251.51", "adielmo@gmail.com");
  
   Optional<String> clientOptional = Optional.ofNullable(cliente.getEmail());
   //Optional<String> clientOptional = Optional.of(cliente.getEmail());
   //adielmo@gmail.com
  // System.out.println(clientOptional.orElseThrow(() -> new IllegalArgumentException("E-mail não encotrado!")));
   System.out.println(clientOptional.orElseThrow(() -> new RuntimeException("Error !!")));
		
		
	}

}

package com.java.recursividade;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java.optional.Cliente;

public class TesteRecursividade {

	public static void main(String[] args) {
		Cliente c1 =new Cliente(1L, "Adielmo", "934-650-251.51", "adielmo@gmail.com");
		Cliente c2 = new Cliente(2L, "Arthur", "018.982.872-09", "arthur@gmail.com");
		Cliente c3 = new Cliente(3L, "Joilma", "983.982.872-29", "joilma@gmail.com");
		Cliente c4 =new Cliente(4L, "Pedro", "872-287-093.51", "pedro@gmail.com");
		Cliente c5 = new Cliente(5L, "Adriana", "092.918.092-23", "arthur@gmail.com");
		Cliente c6 = new Cliente(6L, "Joilma", "120.009.800-10", "joilma@gmail.com");
		
		List<Cliente> list = Arrays.asList(c1, c2, c3, c4, c5, c6);
    List<String> listCpf =	list.stream()
    		                .map(Cliente::getCpf)
    		                .collect(Collectors.toList());	
	Set<String> listEmail=	list.stream()
			                .map(i -> i.getEmail())
			                .collect(Collectors.toSet());
	   
	listEmail.forEach(i -> System.out.println(i));
	System.out.println(listEmail.stream().count());
	listCpf.stream().forEach(i -> System.out.print(i + "    "));
	System.out.println("\n"+listCpf.stream().count());
		
	}

}

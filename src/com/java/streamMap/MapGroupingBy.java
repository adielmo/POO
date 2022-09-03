package com.java.streamMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapGroupingBy {

	public static void main(String[] args) {


		Map<String, List<Cliente>> map;//016.560.601-25
		List<Cliente> users= Arrays.asList(new Cliente("006.471.405-13","Panela", false),
				                          new Cliente("513.471.405-10","Maria", true),
				                          new Cliente("081.471.405-13","Joana", true),
				                          new Cliente("016.560.601-23","Pedro", false),
				                          new Cliente("045.471.405-10","Marta", true),
				                          new Cliente("052.471.405-13","Ana", true),
				                          new Cliente("022.52.601-25","Paulo", false),
				                          new Cliente("056.582.405-10","Marcos", true),
				                          new Cliente("056.471.405-13","Leo", true),
				                          new Cliente("085.582.405-10","Marcela", true),
				                          new Cliente("006.471.405-13","Raul", true));
		//Method Reference
		map = users.stream()
		        .collect(Collectors.groupingBy(Cliente::getName));
		//Lambda function
		Map<String, List<Cliente>> collect = users.stream()
		     .collect(Collectors.groupingBy(x -> x.getCpf()));
		
		map.entrySet().forEach(x->{
			System.out.println("Key: " +x.getKey()+
					           " Value: "+x.getValue());
		});
		System.out.println("===========================//=======================");
		collect.entrySet().forEach(x ->{
			System.out.println("Key: " + x.getKey()+
					           " Value: "+x.getValue());
		});
		
		
	}

}

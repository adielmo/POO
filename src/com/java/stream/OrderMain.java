package com.java.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderMain {

	public static void main(String[] args) {
	
		List<OrderDto> orders = Arrays.asList(new OrderDto(1L, 2L, new BigDecimal(100.51)),
				              new OrderDto(2L, 4L, new BigDecimal(156.54)),
				              new OrderDto(6L, 5L, new BigDecimal(63.47)),
				              new OrderDto(3L, 3L, new BigDecimal(56.87)),
				              new OrderDto(4L, 8L, new BigDecimal(365.51)),
				              new OrderDto(5L, 7L, new BigDecimal(25.85)));
		
		BigDecimal sumTotal = orders.stream()
				               .map(OrderDto::getTotal)
				               .reduce(BigDecimal.ZERO, BigDecimal::add);
		Long numberOrder = orders.stream().count();
		List<OrderDto> sortOrder = orders.stream()
				      //.sorted(Comparator.comparing(OrderDto::getOrderNumber, Long::compareTo).reversed())
				      .sorted(Comparator.comparing(OrderDto::getOrderNumber, Long::compareTo))
				      .collect(Collectors.toList());
		
		sortOrder.forEach(x-> System.out.println(x));
				                   
				           
		
		System.out.println("Valor total dos Pedidos: "+sumTotal);
		System.out.println("Qtd de Pedidos: " + numberOrder);

	}

}

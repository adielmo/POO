package com.java.bigDecimal;

import java.math.BigDecimal;

public class TesteBigDecimal {

	public static void main(String[] args) {
Valor valor = new Valor();
valor.setValor(new BigDecimal(33.98));

if (valor.getValor().compareTo(new BigDecimal(21.87)) > 0) {
	System.out.println(valor.getValor() +  " é maior");
}

	}

}

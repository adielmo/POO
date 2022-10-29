package com.java.enumeracao.teste;

public class TesteMain {

	public static void main(String[] args) {
		Number num;
	Enum valor	= isNumberValido(0);
	System.out.println(valor);

	}

	private static Enum isNumberValido(Integer num) {
		
		if (num > 0) {
			return Valido.POSITIVO;
		}else if (num < 0) {
			return Valido.NEGATIVO;
		}
		return Valido.ZERO;
	}

}

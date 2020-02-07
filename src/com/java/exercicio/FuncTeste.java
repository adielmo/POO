package com.java.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncTeste {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Digete seu Nome:");
		funcionario.setNome(sc.nextLine());
		
		System.out.println("Digete seu salário R$: ");
		funcionario.setSalario(sc.nextDouble());
		
		System.out.println("Qual o percentual da taxa: ");
		funcionario.setTaxa(sc.nextDouble());
		
		list.add(funcionario);
		
		System.out.println(funcionario);
		System.out.println("Salário liquido: R$" + funcionario.calcularTaxa());
	}

}

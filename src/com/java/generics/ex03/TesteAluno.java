package com.java.generics.ex03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteAluno {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	Set<Curso> cursos = new HashSet<Curso>();
	boolean flag = false;
	String nome;
	long codigo;
	
	while (!flag) {
		
		System.out.println("Entre com o Código do Curso:");
		 codigo = sc.nextLong();
		
		System.out.println("Entre com o Nome do Curso:");
		 nome = sc.next();
		 
		 cursos.add(new Curso(codigo, nome));
		 
		 System.out.println("Entre com o Código do Aluno:");
		 codigo = sc.nextLong();
		
		System.out.println("Entre com o Nome do Aluno:");
		 nome = sc.next();
		 
		 
		 
		
	}

	}

}

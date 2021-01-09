package com.java.collection.generics.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.java.collection.generics.Aluno;

public class TestSet {

	public static void main(String[] args) {

		Aluno a1 = new Aluno(1L, "João", "joao@gmail.com");
		Aluno a2 = new Aluno(2L, "Maria", "maria@gmail.com");
		Aluno a3 = new Aluno(3L, "Amanda", "amanda@gmail.com");
		Aluno a4 = new Aluno(4L, "Adielmo", "adielmo@gmail.com");
		Aluno a5 = new Aluno(5L, "Joilma", "joilma@gmail.com");
		Aluno a6 = new Aluno(2L, "Maria", "mariana@gmail.com");
		Aluno a7 = new Aluno(4L, "adielmo", "joana@gmail.com");
		
		Set<Aluno> alunos = new HashSet<>();
				
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);
		alunos.add(a6);
		alunos.add(a7);
		Aluno a = new Aluno(4L, "Adielmo", "adielmo@gmail.com");
		System.out.println("Contem esse Objeto: " + alunos.contains(a));
		
		alunos.forEach(System.out::println);
		
	}

}

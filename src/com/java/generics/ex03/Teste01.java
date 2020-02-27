package com.java.generics.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Teste01 {

	public static void main(String[] args) {
		
		Set<Login> logins = new TreeSet<Login>();
		//Set<Login> logins = new HashSet<Login>();
		//Set<Login> logins = new LinkedHashSet<Login>();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Path do File:\nEx: c:\\temp\\logs.txt");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();

			while (linha != null) {

				String[] fields = linha.split(" ");
				logins.add(new Login(Long.parseLong(fields[0]),fields[1], Date.from(Instant.parse(fields[2]))));

				linha = br.readLine();
			}
			
			System.out.println("Qtd de Acesso: "+ logins.size()+"\n");
			
			for (Login user : logins) {
				System.out.println(user.getCodigo()+ " - "+ user.getNome());
			}
			
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}
	}

}

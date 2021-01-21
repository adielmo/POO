package com.java.arquivo;

import java.io.File;
import java.util.Scanner;

public class CriandoFolder {
	public static void main(String[] args) {
		
		//Criando um Folder dentro do outros
		Scanner sc = new Scanner(System.in);
		System.out.println("C:/FileIO/DemoDirectory");		
		File folder; 
		
		System.out.println("Digete o path para o new Folder:");
		folder = new File(sc.nextLine());
		
		
		if (!folder.exists()) {
			folder.mkdirs();
			System.out.println("successfully");
		}else {
			System.out.println("Path: " + folder + "\nJá existente!");
		}
		

		/*
		 * boolean isDirectoryCreated = dir.mkdir(); if (isDirectoryCreated) {
		 * System.out.println("successfully"); } else { System.out.println("not"); }
		 */		
		/*System.out.println("Enter a folder path: ");
		System.out.println("Ex: c:\\temp");
		String strPath = sc.nextLine();
		

		boolean success = new File(strPath + "\\java").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();
	*/	
	}

}

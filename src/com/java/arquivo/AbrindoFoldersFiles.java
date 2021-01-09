package com.java.arquivo;

import java.io.File;
import java.util.Scanner;

public class AbrindoFoldersFiles {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Listar todos os Files dento Folder temp
		
		System.out.println("Enter a folder path: ");
		System.out.println("Ex: c:\\temp");
		
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("PASTAS - (FOLDERS):");
		
		for (File folder : folders) {
		System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("ARQUIVOS -(FILES):");
		
		for (File file : files) {
		System.out.println(file);
		}
		
	/*	boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();
	
	*/
	}
}

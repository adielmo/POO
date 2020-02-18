package com.java.arquivo;

import java.io.File;
import java.util.Scanner;

public class CriandoFolder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		System.out.println("Ex: c:\\temp");
		String strPath = sc.nextLine();
		

		boolean success = new File(strPath + "\\java").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();
		
	}

}

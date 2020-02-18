package com.java.arquivo;

import java.io.File;
import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {

		File file = new File("c:\\temp\\java.pdf");
		Scanner sc = null;
		try {
			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {

			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}

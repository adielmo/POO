package com.java.collection.generics.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.java.collection.generics.Log;
import com.java.collection.generics.TratarException;

public class MainLogLeituraFile {

	public static void main(String[] args) {
		DateFormat formatDateHora = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		DateFormat formatDate= new SimpleDateFormat("dd-MM-yyyy");
		Random random = new Random();
		Date dateAtual = new Date();

		String dateHora = formatDateHora.format(dateAtual);
		String date = formatDate.format(dateAtual);
		
		Scanner scanner = new Scanner(System.in);
		String inPath;
		String nameFile = random.nextInt(101) + "_" + date + ".txt";
		String outPath = "c:\\temp\\out_"+ nameFile;
		String aa = "c:\\adielmo\\santos\\out_"+ nameFile;

		System.out.println("c:\\temp\\in.txt");
		System.out.println("Digete o Path:");
		inPath = scanner.nextLine();

		Set<Log> logs = new HashSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader(inPath))) {

			
			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(" ");
				String userName = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				logs.add(new Log(userName, moment));
				line = br.readLine();
			}
			
			System.out.println("Total de User no File: "  + logs.size()+"\n");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	File salvePath = criarFolder(scanner);
	
	//Gerar uma File .txt	
try (BufferedWriter bw = new BufferedWriter(new FileWriter(salvePath))){
	
	bw.write(String.format("\nData Atual: %s \n \n", dateHora));
	bw.write("");
	
	for (Log log : logs) {
		bw.write(log.toString());
		bw.newLine();
	}
	
	bw.write("\n\nTotal de User no File: "  + logs.size());	
	System.out.println("Arquivo gerado com sucesso !\nFile salve no Folder no Path:\n " + salvePath);
	
		} catch (Exception e) {

			System.out.println("Error: " + e.getMessage());
		} 

	}

	private static File criarFolder(Scanner scanner) {
		System.out.println("Digete o Path para salve do File\nEx: 'C:\\temp' !");	
		File salvePath = new File(scanner.nextLine());
		
		if (!salvePath.exists()) {
			salvePath.mkdirs();
			
		}
		return salvePath;
	}

}

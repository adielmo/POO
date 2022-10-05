package com.java.files.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import javax.annotation.processing.SupportedSourceVersion;

import com.java.files.model.Customers;
import com.java.files.model.Path;

public class MainCustomersRead {
	
	public static void main(String[] args) {
		
		DateFormat dDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date = new Date();
		String dateFormat = dDate.format(date);
		//System.out.println(format);
	String replaceAll = dateFormat.replaceAll("[:-]", "").replaceAll("[ ]", "-");
		
		System.out.println("Entre com o path do file:");
		String line = "";
		Long count =0L;
		List<Customers> customers = new ArrayList<>();
	//String pathIn = "C:\\Users\\Escritorio 01\\Downloads\\Rede\\projetoJavaTwlio\\customers.csv";
	String pathOut = "C:\\Users\\Escritorio 01\\Downloads\\Rede\\projetoJavaTwlio\\"+"customers"+ 
		                new Random().nextInt(1000)+"-"+replaceAll+".csv";
		
		try (BufferedReader reader = new BufferedReader(new FileReader(Path.PATHIN))){
			
			
		while ((line = reader.readLine()) != null) {
		String[] split = line.split(",");		
		
			
		addCustomers(testeLinha(count), split, customers);		
		count=+ contadorLinha(count);

			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage() + " Error.");
		}
		
		
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathOut))) {
String colum = "UUID, ID, FIRSTNAME, LASTNAME, EMAIL, GENDER, CONTACTNO, COUNTRY, DOB, AMOUNT ";
			writer.write(String.format("\nData Atual: %s \n \n", dateFormat));

			writer.write(colum+"\n");
			for (Customers customers2 : customers) {
				
				writer.write(customers2.toString());
				writer.newLine();
				
				
			}
			customers.stream().limit(3).forEach(customer -> {
				System.out.println(customer.toString());
			});

		} catch (Exception e) {
			System.out.println(e.getMessage()+"Error.");
		}
		System.out.println("Arquivo gerado com sucesso.");
		/*
		 * customers.forEach(x -> { System.out.println(x.toString()); });
		 */

	}

	private static long contadorLinha(Long count) {
		return count+1;
		
	}

	private static void addCustomers(boolean testeLinha, String[] split, List<Customers> customers) {
		if (testeLinha) {
			var randomBigDecimal = gerarRandomBigDecimal();
			customers.add(new Customers(UUID.randomUUID(), Long.parseLong(split[0]),
                    split[1], split[2], split[3],
                    split[4], split[5], split[6], split[7], randomBigDecimal));

		}
		
	}

	private static BigDecimal gerarRandomBigDecimal() {
		//DecimalFormat df = new DecimalFormat("0.##");

		double start = 1000, end = 25000;
		double random = new Random().nextDouble();
		double result = start + (random * (end - start));
		//df.format(result);
		
		return new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN);

	}

	private static boolean testeLinha(Long count) {	
	
		
		  if (count < 1) {
			  return false; 
			  }
		 
		return true;
	}

}

package com.java.exception.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TesteReseva {
	public static void main(String[] ars) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAtual = new Date();
			Scanner sc = new Scanner(System.in);
			int numeroQuarto;
			Date data_entrada, data_saida;
		
		System.out.println("Data Atual: "+sdf.format(dataAtual)+"\n");
		
		try {
		System.out.println("Entre como número do Quarto:");
		  numeroQuarto=sc.nextInt();
		System.out.println("Entre com a Data de Entrada (dd/MM/yyyy):");
		  data_entrada=sdf.parse(sc.next());
		System.out.println("Entre com a Data de Saída (dd/MM/yyyy):");
		  data_saida=sdf.parse(sc.next());
		  
		Resevas resevas = new Resevas(numeroQuarto, data_entrada, data_saida);
		System.out.println(resevas);  
		
			/*
			 * System.out.println("Entre como número do Quarto:");
			 * numeroQuarto=sc.nextInt();
			 */
		System.out.println("Atualizar Data de Entrada (dd/MM/yyyy):");
		  data_entrada=sdf.parse(sc.next());
		System.out.println("Atulizar Data de Saída (dd/MM/yyyy):");
		  data_saida=sdf.parse(sc.next());
		  resevas.atualizarCheck(data_entrada, data_saida);
		  
		}
		catch (DataException e) {
			System.out.println(e.getMessage());
		}
		catch (ParseException e) {
			System.out.println("Error, no formato de Data!!");
		}
		catch (Exception e) {
			System.out.println("Error!!");
		}
		
		//System.out.println(rese);
		
	sc.close();	
	}

}

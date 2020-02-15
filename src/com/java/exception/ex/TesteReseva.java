package com.java.exception.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TesteReseva {
	
	public static void main(String[] ars) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAtual = new Date();
		// LocalDate hoje = LocalDate.now();
		Scanner sc = new Scanner(System.in);
		int opcao = 1;
		String entrada;
		Resevas resevas = null;
		List<Resevas> listResevas = new ArrayList<>();
		boolean flag = false;

		while (!flag) {
			System.out.println("***********************//***********************");
			System.out.println("Data Atual: " + sdf.format(dataAtual) + "\n");
			System.out.println("*** Digete a opção desejada: ***");
			System.out.println("1 - Reseva de Quarto:");
			System.out.println("2 - Atualizar Reseva:");
			System.out.println("3 - Consultar todas Reseva:");
			System.out.println("4 - Consultar Reseva por Quarto:");
			System.out.println("5 - Sair:");

			try {

				entrada = sc.next();
				opcao = Integer.parseInt(entrada);

				switch (opcao) {
				case 1:

					resevarQuarto(sdf, sc, listResevas);
					break;

				case 2:

					atualizarResevas(sdf, sc, resevas, listResevas);
					break;
				case 3:

					imprimirTodasResevas(listResevas);
					break;

				case 4:
					imprimirResevaNumeroQuarto(listResevas, sc);

					break;

				case 5:
					boolean valido = false;
					sc.nextLine();

					flag = desejaSair(sc, flag);

					break;

				default:

					System.out.println("Entrada está invalida!");
					break;
				}

			} catch (Exception e) {
				System.out.println("Opção Inválida, Digete novamente!!");
			}

		}

		sc.close();
	}

	private static boolean desejaSair(Scanner sc, boolean flag) {
		boolean valido;
		do {
			valido = false;
			System.out.println("Deseja realmente Sair? (s-n)");
			char letra = sc.nextLine().charAt(0);

			if (letra == 's') {

				flag = true;
				System.exit(0);

			} else if (letra == 'n') {

			} else {

				valido = true;
			}

		} while (valido);
		return flag;
	}

	private static void imprimirResevaNumeroQuarto(List<Resevas> listResevas, Scanner sc) {
		System.out.println("Digete o Número do Quarto:");
		int numeroQuarto = sc.nextInt();

		try {
			validarQuarto(listResevas);
			int posicao = buscarQuartoExistente(listResevas, numeroQuarto);
			System.out.println(listResevas.get(posicao).toString());

		} catch (PosicaoException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("Entre somente um o Números:");
		}

	}

	private static void imprimirTodasResevas(List<Resevas> listResevas) {
		try {
			validarQuarto(listResevas);
			for (int i = 0; i < listResevas.size(); i++) {
				System.out.println((i+1)+"° "+ listResevas.get(i).toString());

			}
		} catch (PosicaoException e) {
			System.out.println(e);
		}
	}

	private static void resevarQuarto(SimpleDateFormat sdf, Scanner sc, List<Resevas> listResevas) {
		int numeroQuarto;
		Date data_entrada;
		Date data_saida;
		Resevas resevas = null;
		boolean flag = false;

		do {
			try {
				flag = false;

				System.out.println("Entre como número do Quarto:");
				numeroQuarto = sc.nextInt();
				entradaNumeroQuarto(listResevas, sc, numeroQuarto);

				System.out.println("Entre com a Data de Entrada (dd/MM/yyyy):");
				data_entrada = sdf.parse(sc.next());
				System.out.println("Entre com a Data de Saída (dd/MM/yyyy):");
				data_saida = sdf.parse(sc.next());

				listResevas.add(resevas = new Resevas(numeroQuarto, data_entrada, data_saida));
				System.out.println(resevas);

			} catch (ParseException e) {
				System.out.println("Error, no formato de Data!!");
				flag = true;
			} catch (DataException e) {
				System.out.println(e.getMessage());
				flag = true;

			} catch (NumeroQuartoException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("Error!!");
				flag = true;
			}
		} while (flag);

	}

	private static void entradaNumeroQuarto(List<Resevas> listResevas, Scanner sc, int numeroQuarto)
			throws NumeroQuartoException {

		for (int i = 0; i < listResevas.size(); i++) {
			if (listResevas.get(i).getNumeroQuarto() == numeroQuarto) {
				throw new NumeroQuartoException("Quarto do Número " + numeroQuarto + " já está ocupado!");

			}

		}

	}

	private static void atualizarResevas(SimpleDateFormat sdf, Scanner sc, Resevas resevas, List<Resevas> listResevas) {
		Date data_entrada, data_saida;
		boolean flag = false;
		int numeroQuarto;

		try {
			flag = false;
			sc.nextLine();
			System.out.println("Atualizar qual número do Quarto:");
			numeroQuarto = sc.nextInt();

			validarQuarto(listResevas);

			atualizarDatas(sdf, sc, listResevas, numeroQuarto);

		} catch (ParseException e) {
			System.out.println("Error, no formato de Data!!");

		} catch (DataException e) {

			System.out.println(e.getMessage());

		} catch (PosicaoException e) {
			System.out.println(e.getMessage());

		}

	}

	private static void atualizarDatas(SimpleDateFormat sdf, Scanner sc, List<Resevas> listResevas, int numeroQuarto)
			throws ParseException, DataException {
		Date data_entrada, data_saida;
		boolean flag = false;
		int posicao = buscarQuartoExistente(listResevas, numeroQuarto);

		if (posicao >= 0) {
			do {
				flag = true;
				System.out.println("Atualizar Data de Entrada (dd/MM/yyyy):");
				data_entrada = sdf.parse(sc.next());

				System.out.println("Atulizar Data de Saída (dd/MM/yyyy):");
				data_saida = sdf.parse(sc.next());

				listResevas.get(posicao).atualizarCheck(data_entrada, data_saida);

			} while (!flag);
		}else {
			System.out.println("Numero de Quarto " + numeroQuarto + " não encotrado!");
		}
	}

	public static void validarQuarto(List<Resevas> listResevas) throws PosicaoException {

		if (listResevas.size() < 0) {
			throw new PosicaoException("Não tem nenhum Quarto Ocupado!!");
		}

	}

	public static int buscarQuartoExistente(List<Resevas> listResevas, int numeroQuarto) {

		for (int i = 0; i < listResevas.size(); i++) {

			if ((listResevas.get(i).getNumeroQuarto() == numeroQuarto)) {

				return i;
			}

		}

		return -1;
	}

}

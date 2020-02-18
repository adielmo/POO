package com.java.exception.ex02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TesteConta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		String entrada;
		int opcao = 1;
		List<Conta> contas = new ArrayList<>();		
		Date data_atual = new Date();
		
		while (!flag) {
			System.out.println("***********************//***********************");
			System.out.println("*** Digete a opção desejada: ***");
			System.out.println("1 - Cadastrar uma Conta:");
			System.out.println("2 - Depositar:");
			System.out.println("3 - Saque:");
			System.out.println("4 - Consultar conta:");
			System.out.println("5 - Consultar todas as Contas:");
			System.out.println("6 - Todas as Contas Por Agencia:");
			System.out.println("7 - Valor total Todas Contas:");
			System.out.println("8 - Consultar por Tipo de Conta:");
			System.out.println("9 - Exlcuir uma Conta:");
			System.out.println("0 - Sair:");

			try {

				entrada = sc.next();
				opcao = Integer.parseInt(entrada);

				switch (opcao) {
				case 1:
					flag = entradaDadosConta(sc, contas, data_atual);

					break;

				case 2:
					fazerDeposito(sc, contas);

					break;
				case 3:
					fazerSaque(sc, contas);

					break;

				case 4:

					buscarConta(sc, contas);

					break;

				case 5:

					buscarTodasContas(contas);
					break;
				case 6:

					buscarContasPorAgencia(sc, contas);
					break;
				case 7:

					totalDeTodasContas(contas);
					break;
				case 8:
					buscarPorTipoConta(sc, contas);

					break;
				case 9:
					removerConta(sc, contas);

					break;
				case 0:
					flag = sair(sc);

					break;

				default:
					System.out.println("Opção Inválida!!");
					break;
				}

			} catch (Exception e) {
				System.out.println("Entra Inválida!!");
			}

		}
	}

	private static void buscarPorTipoConta(Scanner sc, List<Conta> contas) {
		boolean flag = false;
		String opcao;
		try {
			do {
				flag = false;

				existemContas(contas);
				System.out.println("Qual Tipo de conta Poupança/Corrente (p - c):");
				char desejaDepositar = sc.next().charAt(0);

				flag = (desejaDepositar != 'p' && desejaDepositar != 'c') ? false : true;
				opcao = (desejaDepositar == 'p') ? "Poupança" : "Corrente";

				imprimirPorTipoConta(flag, contas, sc, opcao);

			} while (!flag);

		} catch (AgenciaOuContaExisteException e) {

			System.out.println(e.getMessage());
		}

	}

	private static void imprimirPorTipoConta(boolean flag, List<Conta> contas, Scanner sc, String opcao) {
		double total = 0;
		int count = 0;

		if (flag) {
			for (int i = 0; i < contas.size(); i++) {

				if (contas.get(i).getTipoConta().getNome().equalsIgnoreCase(opcao)) {

					System.out.println(contas.get(i).toString());

					total += contas.get(i).calcularSaldoLiquido();
					count++;

				} else if (contas.get(i).getTipoConta().getNome().equals(opcao)) {

					System.out.println(contas.get(i).toString());

					total += contas.get(i).calcularSaldoLiquido();
					count++;

				}

			}
			if (count > 0) {
				System.out.println("Valor total da Contas R$: " + String.format("%.2f", total));
				System.out.println("Qtd de Contas: " + count);

			}

		}

	}

	private static void removerConta(Scanner sc, List<Conta> contas) {
		int agencia, numero;

		try {
			System.out.println("Entre com Número da Agencia:");
			agencia = sc.nextInt();

			System.out.println("Entre com Número da Conta:");
			numero = sc.nextInt();

			excluirAgenciaConta(agencia, numero, contas);

		} catch (ContaExcluirException e) {
			System.out.println(e.getMessage());

		} catch (ContaNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void excluirAgenciaConta(int agencia, int numero, List<Conta> contas)
			throws ContaNaoExisteException, ContaExcluirException {

		validarAgenciaContaExistente(contas, agencia, numero);

		int posicao = buscarPosicaoAgenciaConta(contas, agencia, numero);

		if (contas.get(posicao).getSaldo() > 0) {

			throw new ContaExcluirException("Conta não pode ser excluida, só com Saldo igual a 0!");
		}
		contas.remove(posicao);

	}

	private static void totalDeTodasContas(List<Conta> contas) {
		int count = 0;
		double total = 0;

		try {
			existemContas(contas);

			for (int i = 0; i < contas.size(); i++) {
				total += contas.get(i).calcularSaldoLiquido();
				count++;
			}
			System.out.println("*** Banco Tabajara ***");
			System.out.println("Valor Todas as Contas: " + String.format("%.2f", total));
			System.out.println("Quantidade de Contas: " + count);
			System.out.println("Valor médio por Conta: " + String.format("%.2f", (total / count)));

		} catch (AgenciaOuContaExisteException e) {

			System.out.println(e.getMessage());
		}

	}

	private static void buscarContasPorAgencia(Scanner sc, List<Conta> contas) {
		int agencia;
		try {
			System.out.println("Entre numero Agencia:");
			agencia = sc.nextInt();

			imprimirTodasContasDeUmaAgencia(contas, agencia);

		} catch (AgenciaOuContaExisteException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void imprimirTodasContasDeUmaAgencia(List<Conta> contas, int agencia)
			throws AgenciaOuContaExisteException {
		int count = 0;
		double total = 0;

		validarUmaAgencia(contas, agencia);

		for (int i = 0; i < contas.size(); i++) {

			if (contas.get(i).getAgencia() == agencia) {

				System.out.println(contas.get(i).toString());

				total += contas.get(i).calcularSaldoLiquido();
				count++;

			}

		}
		System.out.println("Agencia :" + agencia);
		System.out.println("Qtd de Contas: " + String.format("%.2f", total));
		System.out.println("Valor total R$ : " + count + "\n");

	}

	private static void validarUmaAgencia(List<Conta> contas, int agencia) throws AgenciaOuContaExisteException {
		boolean flag = false;

		for (int i = 0; i < contas.size(); i++) {

			if ((contas.get(i).getAgencia() == agencia)) {
				flag = true;

				break;
			}
		}

		if (!flag) {
			throw new AgenciaOuContaExisteException("Agencia de Código " + agencia + " não existe!!");
		}

	}

	private static void buscarTodasContas(List<Conta> contas) {
		try {
			existemContas(contas);

			for (int i = 0; i < contas.size(); i++) {
				System.out.println((i + 1) + "º" + contas.get(i));

			}

		} catch (AgenciaOuContaExisteException e) {

			System.out.println(e.getMessage());
		}
	}

	private static void buscarConta(Scanner sc, List<Conta> contas) {
		int agencia, numero;

		try {
			System.out.println("Entre numero Agencia:");
			agencia = sc.nextInt();
			System.out.println("Entre numero :");
			numero = sc.nextInt();

			imprimirUmaConta(contas, agencia, numero);

		} catch (ContaNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void imprimirUmaConta(List<Conta> contas, int agencia, int numero) throws ContaNaoExisteException {

		validarAgenciaContaExistente(contas, agencia, numero);
		int posicao = buscarPosicaoAgenciaConta(contas, agencia, numero);

		System.out.println(contas.get(posicao).toString());

	}

	private static void fazerSaque(Scanner sc, List<Conta> contas) {
		int agencia, numero;
		try {

			System.out.println("Entre numero Agencia:");
			agencia = sc.nextInt();

			System.out.println("Entre numero :");
			numero = sc.nextInt();

			saque(sc, contas, agencia, numero);

		} catch (ContaNaoExisteException e) {
			System.out.println(e.getMessage());

		} catch (SaqueException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void saque(Scanner sc, List<Conta> contas, int agencia, int numero)
			throws ContaNaoExisteException, SaqueException {

		validarAgenciaContaExistente(contas, agencia, numero);
		int posicao = buscarPosicaoAgenciaConta(contas, agencia, numero);

		if (posicao >= 0) {
			System.out.println("Entre com valor R$ :");
			double valorSaque = sc.nextDouble();
			contas.get(posicao).saque(valorSaque);
		}

	}

	private static void fazerDeposito(Scanner sc, List<Conta> contas) {
		int agencia, numero;

		try {
			System.out.println("Entre número Agencia:");
			agencia = sc.nextInt();

			System.out.println("Entre número da Conta:");
			numero = sc.nextInt();

			depositar(sc, contas, agencia, numero);

		} catch (ContaNaoExisteException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void depositar(Scanner sc, List<Conta> contas, int agencia, int numero)
			throws ContaNaoExisteException {
		int posicao;
		double valorDeposito;

		validarAgenciaContaExistente(contas, agencia, numero);

		posicao = buscarPosicaoAgenciaConta(contas, agencia, numero);

		if (posicao >= 0) {
			System.out.println("Entre com valor R$ :");
			valorDeposito = sc.nextDouble();

			contas.get(posicao).depositar(valorDeposito);
		}
	}

	private static boolean entradaDadosConta(Scanner sc, List<Conta> contas, Date data_atual) {
		boolean flag = false;
		;
		double valorDeposito;
		char tipoConta, desejaDepositar;
		int numero = 0, agencia = 0;
		do {
			try {
				flag = false;
				System.out.println("Entre com Número da Agencia:");
				agencia = sc.nextInt();

				System.out.println("Entre com Número da Conta:");
				numero = sc.nextInt();

				validarCadastroDeAgenciaConta(contas, agencia, numero);

			} catch (AgenciaOuContaExisteException e) {
				flag = true;
				System.out.println(e.getMessage());
			}
		} while (flag);

		System.out.println("Entre com Nome:");
		String nome = sc.next();

		System.out.println("Qual o valor do Limete para Saque:");
		double limeteSaque = sc.nextDouble();

		do {
			flag = false;
			System.out.println("Deseja fazer um Deposito (s-n):");
			desejaDepositar = sc.next().charAt(0);

			flag = (desejaDepositar != 's' && desejaDepositar != 'n') ? true : false;

		} while (flag);

		do {
			flag = false;
			System.out.println("Qual tipo de Conta (p - c):");
			tipoConta = sc.next().charAt(0);

			flag = (tipoConta != 'p' && tipoConta != 'c') ? true : false;

		} while (flag);

		if (desejaDepositar == 's' && tipoConta == 'p') {
			System.out.println("Valor do Depósito R$:");
			valorDeposito = sc.nextDouble();

			System.out.println("Entre com o valor Percetual de Juros %:");
			double taxaJuros = sc.nextDouble();

			contas.add(new ContaPoupanca(numero, agencia, nome, data_atual, valorDeposito, limeteSaque, taxaJuros,
					TipoConta.POUPANCA));

		} else if (desejaDepositar == 's' && tipoConta == 'c') {
			System.out.println("Valor do Depósito R$:");
			valorDeposito = sc.nextDouble();

			System.out.println("Entre da Taxa de Manutenção da Conta Corrente %:");
			double taxaManutencao = sc.nextDouble();

			contas.add(new ContaCorrente(numero, agencia, nome, data_atual, valorDeposito, limeteSaque, taxaManutencao,
					TipoConta.CORRENTE));

		} else if (desejaDepositar == 'n' && tipoConta == 'p') {

			System.out.println("Entre com o valor Percetual de Juros %:");
			double taxaJuros = sc.nextDouble();

			contas.add(
					new ContaPoupanca(numero, agencia, nome, data_atual, limeteSaque, taxaJuros, TipoConta.POUPANCA));

		} else if (desejaDepositar == 'n' && tipoConta == 'c') {
			System.out.println("Entre da Taxa de Manutenção da Conta Corrente %:");
			double taxaManutencao = sc.nextDouble();

			contas.add(new ContaCorrente(numero, agencia, nome, data_atual, limeteSaque, taxaManutencao,
					TipoConta.CORRENTE));

		}
		return flag;
	}

	private static void validarCadastroDeAgenciaConta(List<Conta> contas, int agencia, int numero)
			throws AgenciaOuContaExisteException {

		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getAgencia() == agencia && contas.get(i).getNumero() == numero) {

				throw new AgenciaOuContaExisteException("Essa Conta, na Agencia " + agencia + " já existe!");
			}
		}

	}

	private static void validarAgenciaContaExistente(List<Conta> contas, int agencia, int numero)
			throws ContaNaoExisteException {

		int posicao = buscarPosicaoAgenciaConta(contas, agencia, numero);

		if (posicao < 0) {
			throw new ContaNaoExisteException("Número da conta ou Agencia, não existe!!");
		}

	}

	private static int buscarPosicaoAgenciaConta(List<Conta> contas, int agencia, int numero) {

		for (int i = 0; i < contas.size(); i++) {

			if (contas.get(i).getNumero() == numero && contas.get(i).getAgencia() == agencia) {
				return i;
			}

		}
		return -1;
	}

	private static void existemContas(List<Conta> contas) throws AgenciaOuContaExisteException {

		if (contas.size() < 1) {
			throw new AgenciaOuContaExisteException("Nenhuma Conta Cadastrada!");
		}
	}

	private static boolean sair(Scanner sc) {
		boolean flag;
		char letra;
		do {
			flag = false;
			System.out.println("Deseja Sair (s - n)");
			letra = sc.next().charAt(0);

			if (letra == 's') {
				System.out.println("**** Fim ****");
				System.exit(0);
			} else if (letra == 'n') {
				break;

			} else {
				flag = true;
			}

		} while (flag);
		return flag;
	}

}

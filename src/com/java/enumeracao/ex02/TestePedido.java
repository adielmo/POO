package com.java.enumeracao.ex02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.java.enumeracao.ex.ContratoHoras;
import com.java.enumeracao.ex.Departamento;
import com.java.enumeracao.ex.NivelTrabalhador;
import com.java.enumeracao.ex.Trabalhador;

public class TestePedido {

	public static void main(String[] args) throws ParseException {
		String email, nome, status;
		Date data;
		double valor = 0, valorHora = 0;
		int qtd, qtdHoras;
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite o seu Nome:");
		nome = sc.nextLine();

		System.out.println("Digete seu E-mail:");
		email = sc.next();

		System.out.println("Digete a data (dd/MM/YYYY):");
		data = sdf.parse(sc.next());

		System.out.println("Entre com Status do Pedido:");
		status = sc.next();

		Pedido pedido = new Pedido(data, OrderStatus.valueOf(status), new Cliente(nome, email, data));

		System.out.println("Digete a quantidade de  itens no Pedido:");
		qtd = sc.nextInt();

		for (int i = 1; i <= qtd; i++) {
			
             sc.nextLine();
             
			System.out.println("Digete o nome do " + i +"º"+" Item:");
			nome = sc.nextLine();

			System.out.println("Entre com valor da " + nome + " :");
			valor = sc.nextDouble();
			System.out.println("Entre com quantidade da " + nome + " :");
			int item = sc.nextInt();

			ItemPedido itemPedido = new ItemPedido(item, valor, new Produto(nome, valor));
			pedido.adicionarItem(itemPedido);

		}
		System.out.println(pedido.toString());

	}

}

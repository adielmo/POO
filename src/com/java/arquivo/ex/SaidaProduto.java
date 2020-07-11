package com.java.arquivo.ex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import com.java.programacaoFuncional.Item;

public class SaidaProduto {

	public static void main(String[] args) {

		DateFormat d = new SimpleDateFormat("dd-MM-yyyy");
		// DecimalFormat df = new DecimalFormat("##,###.#####");
		// DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy@HH-mm-ss");
		DateFormat dDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		Date dataAtual = new Date();

		String dd = d.format(dataAtual);
		// String data = dateFormat.format(dataAtual);
		String hj = dDate.format(dataAtual);
		System.out.println(hj);

		Random random = new Random();

		Item p1 = new Item(3L, "Feijão", 12.57, 12);
		Item p2 = new Item(5L, "Arroz", 15.78, 19);
		Item p3 = new Item(8L, "Acuçar", 2.49, 2);
		Item p4 = new Item(1L, "Café", 11.75, 23);
		Item p5 = new Item(9L, "Cerveja", 4.98, 38);
		Item p6 = new Item(7L, "Refrigerante", 7.89, 41);
		Item p7 = new Item(12L, "Det. Liquido", 1.97, 51);
		Item p8 = new Item(2L, "Sabonete", 2.39, 29);
		Item p9 = new Item(4L, "Desodorante", 15.71, 75);
		Item p10 = new Item(11L, "Espaguete", 3.75, 62);
		Item p11 = new Item(6L, "Queijo Prato", 27.89, 56);
		Item p12 = new Item(11L, "Picanha Bovina", 49.75, 165);

		List<Item> itens = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);

		String path = "c:\\temp\\saida_" + random.nextInt(10001) + "_" + dd + ".txt";
		// String path = "c:\\temp\\doc" + data + ".txt";

		List<Item> produtos = itens.stream().sorted((a, b) -> a.getId().compareTo(b.getId()))
				.collect(Collectors.toList());

		// List<Double> listPrecos = itens.stream().map(x ->
		// x.getPreco()).collect(Collectors.toList());
		// Optional<BigDecimal> valorTotal =
		// listPrecos.stream().map(BigDecimal::new).reduce((a, b) -> a.add(b));

		Optional<BigDecimal> valorTotal = produtos.stream().map(Item::getPreco).map(BigDecimal::new)
				.reduce((a, b) -> a.add(b));
		// .reduce(BigDecimal::add);

		Optional<Integer> qtdEstoque = produtos.stream().map(Item::getQtd).reduce(Integer::sum);
		// .reduce(0, (a, b) -> a + b);

		// .filter((nome) -> nome.getNome().charAt(0) == 'M')

		Long qtdItens = produtos.stream().count();

		List<Item> listNomes = produtos.stream().filter((nome) -> nome.getNome().toUpperCase().charAt(0) == 'C')
				.collect(Collectors.toList());
		
		Optional<BigDecimal> valorTotal02 = listNomes.stream()
							.map(Item::getPreco)
							.map(BigDecimal::new)
							.reduce((a, b) -> a.add(b));
		
		Optional<Integer> qtdEstoque02 = listNomes.stream()
				          .map(Item::getQtd)
				          
				          .reduce(Integer::sum);
		Long qtdItens02 = listNomes.stream()
				          .count();

		// String tt=valorTotal.get().toPlainString();
		String frase = "\n \n \n Qtd de itens nessa lista por Letra\n \n";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

			bw.write(String.format("\nData Atual: %s \n \n", hj));

			for (Item item : produtos) {
				bw.write(item.toString());
				bw.newLine();

			}

			bw.write(String.format("\n \n \nQtd de Itens: %d ", qtdItens));
			bw.write(String.format("\nEstoque: %d", qtdEstoque.get()));
			bw.write(String.format("\nValor Total R$ %.2f", valorTotal.get()));

			bw.write(frase.toUpperCase());

			for (Item item : listNomes) {
				bw.write(item.toString());
				bw.newLine();
			}

			bw.write(String.format("\n \n \nQtd de Itens: %d ", qtdItens02));
			bw.write(String.format("\nEstoque: %d", qtdEstoque02.get()));
			bw.write(String.format("\nValor Total R$ %.2f", valorTotal02.get()));

		} catch (Exception e) {
			System.out.println("Error !");
		}

	}

}

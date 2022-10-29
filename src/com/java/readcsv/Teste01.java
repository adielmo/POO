package com.java.readcsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Teste01 {

	public static void main(String[] args) {
		

		try {
			List<Produto> readFileCsv = readFileCsv(7);

			readFileCsv.stream().limit(10).forEach(prod -> {
				System.out.println(prod.toString());
			});
			System.out.println("\n");
			long count = readFileCsv.stream().count();
			System.out.println(count);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static List<Produto> readFileCsv(int skip) throws IOException {
		List<Produto> produtos = new ArrayList<>();

		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader("C:\\Users\\Escritorio 01\\Downloads\\Rede\\projetoJavaTwlio\\csv\\produtos.csv"))) {
			String line = "";
			int count = 0;

			while ((line = bufferedReader.readLine()) != null) {

				String[] split = line.split(";");
				boolean skipSize = skipLine(skip, count);
				adicionarProduto(split, produtos, skipSize);
				count++;

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return produtos;
	}

	private static void adicionarProduto(String[] split, List<Produto> produtos, boolean skipSize) {

		if (skipSize) {
		produtos.add(new Produto(countId(produtos.size()), split[0], split[1],
			new BigDecimal(split[2].replaceAll(",", ".")).setScale(2, RoundingMode.HALF_EVEN), split[3],
			split[4], split[5], split[6], split[7]));

		}

	}

	private static boolean skipLine(int lineSkip, int count) {

		if (count <= lineSkip) {
			return false;
		}
		return true;
	}

	private static Long countId(int size) {
		Long numLong = Long.valueOf(size);
		return numLong + 1;
	}

}

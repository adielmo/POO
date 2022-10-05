package com.java.streamMatch.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Random;

public class SalvaProdutos {
	
public static void addProdutos(List<Produto> produtos) {
		
		produtos.add(new Produto(1L, "TV 55", gerarBigRandom(2500, 4500), 2));
		produtos.add(new Produto(2L, "TV 42", gerarBigRandom(2000, 2700), 1));
		produtos.add(new Produto(3L, "CERVEJEIRA", gerarBigRandom(1500, 3000), 1));
		produtos.add(new Produto(4L, "PC DE MESA", gerarBigRandom(2500, 6500), 2));
		produtos.add(new Produto(5L, "NOTEBOOK DELL", gerarBigRandom(3000, 6500), 2));
		produtos.add(new Produto(6L, "FOGÃO", gerarBigRandom(750, 2500), 2));
		produtos.add(new Produto(7L, "TV 65", gerarBigRandom(3900, 5800), 2));
		produtos.add(new Produto(8L, "FERRO DE PASSAR", gerarBigRandom(89, 250), 2));
		produtos.add(new Produto(9L, "GELADEIRA", gerarBigRandom(1500, 4500), 5));
		produtos.add(new Produto(10L, "LIDIFICADOR", gerarBigRandom(78, 250), 2));
		produtos.add(new Produto(11L, "MICRO ONDAS", gerarBigRandom(250, 580), 3));
		produtos.add(new Produto(12L, "ARMARIO DE COZINHA", gerarBigRandom(750, 2500), 4));
		produtos.add(new Produto(13L, "TV 95", gerarBigRandom(5000, 9000), 2));
		produtos.add(new Produto(14L, "PANELA ELETRICA", gerarBigRandom(200, 750), 0));
		produtos.add(new Produto(15L, "CAMA DE CASAL", gerarBigRandom(2500, 3800), 2));
		produtos.add(new Produto(16L, "CAMA DE SOLTEIRO", gerarBigRandom(1900, 3100), 0));
		produtos.add(new Produto(17L, "NOTEBOOK VAIO", gerarBigRandom(3000, 4500), 1));
		produtos.add(new Produto(18L, "FORNO ELETRICO CONSUL", gerarBigRandom(1550, 2850), 0));
		produtos.add(new Produto(19L, "TV 65", gerarBigRandom(3900, 5800), 2));
		produtos.add(new Produto(20L, "LAVA LOUÇA", gerarBigRandom(3900, 5150), 2));
		
	}
private static BigDecimal gerarBigRandom(double start, double end) {

	var bigRandom = new Random().nextDouble();

	return new BigDecimal(start + (bigRandom * (end - start))).setScale(2, RoundingMode.HALF_EVEN);
}

}

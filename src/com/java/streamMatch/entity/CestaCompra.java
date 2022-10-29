package com.java.streamMatch.entity;

import java.math.BigDecimal;

public interface CestaCompra {
	
	void adicionarProduto(Produto produto, int quantidade, BigDecimal valorUnitario);
	boolean removerItem(Produto produto);

}

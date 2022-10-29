package com.java.streamMatch.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CestaCompraImpl implements CestaCompra{
	
	List<ProdutoCarrinho> listaProdutos = new ArrayList<>();

	@Override
	public void adicionarProduto(Produto produto, int quantidade, BigDecimal valorUnitario) {
	   int posicaoEncotradaProduto = -1;
	   
	   for (int posicao = 0; posicao < listaProdutos.size() & posicaoEncotradaProduto < 0; posicao++) {
		   
		   if (listaProdutos.get(posicao).equals(produto)) {
			posicaoEncotradaProduto = posicao;
			//break;
		}
		
	}
	   addProduto(posicaoEncotradaProduto, produto, quantidade, valorUnitario); 
	   
	   
		
	}

	public boolean removerItem(Produto produto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void addProduto(int posicaoEncotradaProduto, Produto prod, int quantidade, BigDecimal valorUnitario) {
		
		if (posicaoEncotradaProduto < 0) {
			
			ProdutoCarrinho prodCarrinho = new ProdutoCarrinho(prod, valorUnitario, quantidade);
			prodCarrinho.setTotalProduto(prodCarrinho.getValorTotalProduto());
			listaProdutos.add(prodCarrinho);
		}else {
			var prodRecupCarrinho = listaProdutos.get(posicaoEncotradaProduto);
			
			var novaQuantidade = prodRecupCarrinho.getQuantidadeVenda() + quantidade;
			prodRecupCarrinho.setQuantidadeVenda(novaQuantidade);
			 valorUnitario = prodRecupCarrinho.getValorUnitarioVenda() == valorUnitario ?
					 valorUnitario = prodRecupCarrinho.getValorUnitarioVenda() :
					valorUnitario;
			ProdutoCarrinho newProdCarrinho = 
					new ProdutoCarrinho(prod, valorUnitario, quantidade);
			 
					
			newProdCarrinho.setTotalProduto(newProdCarrinho.getValorTotalProduto());
			listaProdutos.set(posicaoEncotradaProduto, prodRecupCarrinho);
			
		}
		
	}

}

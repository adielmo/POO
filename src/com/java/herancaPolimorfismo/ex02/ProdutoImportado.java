package com.java.herancaPolimorfismo.ex02;

public final class ProdutoImportado extends Produto {

	private Double taxaAlfandega;

	public ProdutoImportado() {

	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	public double precoEtiqueta() {

		return this.preco + this.taxaAlfandega;
	}

	@Override
	public final String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("----Etiqueta de Preço------\n");
		sb.append("Nome: " + this.getNome());
		sb.append("\nTotal Pagar R$: " + precoEtiqueta());
		sb.append("\n(Taxa de Alfandega R$: " + this.taxaAlfandega + ")\n");

		return sb.toString();
	}

}

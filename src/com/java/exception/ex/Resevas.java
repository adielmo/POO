package com.java.exception.ex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Resevas {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer numeroQuarto;
	private Date data_entrada;
	private Date data_saida;

	public Resevas() {
		// TODO Auto-generated constructor stub
	}

	public Resevas(Integer numeroQuarto, Date data_entrada, Date data_saida) throws DataException {
		if (!data_saida.after(data_entrada)) {
			throw new DataException("Data de Saída não pode ser Maior q Data de Entrada!!");
		}
		this.numeroQuarto = numeroQuarto;
		this.data_entrada = data_entrada;
		this.data_saida = data_saida;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}

	public Date getData_saida() {
		return data_saida;
	}

	public void setData_saida(Date data_saida) {
		this.data_saida = data_saida;
	}

	public long quantidadeNoitesResevadas() {
		long tempo = data_saida.getTime() - data_entrada.getTime();
		return TimeUnit.DAYS.convert(tempo, TimeUnit.MILLISECONDS);
	}

	public void atualizarCheck(Date data_entrada, Date data_saida) throws DataException {
		Date data_atual = new Date();

		if (data_entrada.before(data_atual) || data_saida.before(data_atual)) {
			throw new DataException("Data não pode ser Antes da Data atual!!");
		}
		if (!data_saida.after(data_entrada)) {
			throw new DataException("Data de Saída não pode ser Maior q Data de Entrada!!");
		}

		this.data_entrada = data_entrada;
		this.data_saida = data_saida;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("****RESEVAS DE QUARTOS***\n");
		sb.append("Número do Quarto: " + this.numeroQuarto + "\n");
		sb.append("Data de Entrada: " + sdf.format(this.data_entrada) + "\n");
		sb.append("Data de Saída: " + sdf.format(this.data_saida) + "\n");
		sb.append("Qtd de noite Resevada: " + this.quantidadeNoitesResevadas());

		return sb.toString();
	}

}

package com.java.intefaces;

import java.util.Calendar;
import java.util.Date;

public class Servicos {

	private CalcularContratos calcularContratos;

	public Servicos(CalcularContratos calcularContratos) {
		this.calcularContratos = calcularContratos;
	}

	public void processarContrato(Contrato contrato, int qtdParcelas) {
		double valorParcela = contrato.getValorTotal() / qtdParcelas;

		for (int i = 0; i < qtdParcelas; i++) {
			Date dataParcelas = AddMes(contrato.getDataContrato(), i);
			
			double atualizarAliquota = valorParcela + calcularContratos.pagamento(valorParcela, i);
			double atual = atualizarAliquota + calcularContratos.taxaPagamento(atualizarAliquota);
			
			contrato.adicionarPrestacao(new Prestacao(dataParcelas, atual));

		}

	}

	private Date AddMes(Date data, int i) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, i);

		return calendar.getTime();
	}

}

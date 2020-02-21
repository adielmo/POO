package com.java.intefaces;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Servicos {

	private CalcularContratos calcularContratos;
	// calcularContratos.

	public Servicos(CalcularContratos calcularContratos) {
		this.calcularContratos = calcularContratos;
	}

	public void processarContrato(Contrato contrato, int qtdParcelas) {
		double parcela = contrato.getValorTotal() / qtdParcelas;

		for (int i = 0; i < qtdParcelas; i++) {
			Date data = AddMes(contrato.getDataContrato(), i);
			
			double atualizarAliquota = parcela + calcularContratos.pagamento(parcela, i);
			double atual = atualizarAliquota + calcularContratos.taxaPagamento(atualizarAliquota);
			
			contrato.adicionarPrestacao(new Prestacao(data, atual));

		}

	}

	private Date AddMes(Date data, int i) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, i);

		return calendar.getTime();
	}

}

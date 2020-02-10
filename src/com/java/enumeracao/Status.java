package com.java.enumeracao;

public enum Status {
	
	PEDIDO_REALIZADO("Pedido Realizado"),
	AGUARDANDO_PAGAMENTO("Aguardando Pagamento"),
	PAGAMENTO_CONFIRMADO("Pagamento Confirmado"),
	PEDIDO_ENVIADO("Pedido Enviado"),
	PEDIDO_ENTREGUE("Pedido Entregue");
	
	private String Status;
	
	private Status(String status) {
		this.Status = status;
	}
	
	public String getStatus() {
		return this.Status;
	}
	
	

}

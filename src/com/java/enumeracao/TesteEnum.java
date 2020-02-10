package com.java.enumeracao;

import java.util.Date;

public class TesteEnum {
	public static void main(String[] args) {
		
		Ordem ordem = new Ordem();
		ordem.setId(1080);
		ordem.setData(new Date());
		ordem.setStatus(Status.AGUARDANDO_PAGAMENTO);
		
		System.out.println(ordem);
	}

}

package com.java.enumeracao.ex02;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date dataPedido;
	private OrderStatus orderStatus;
	private Cliente cliente;

	private List<ItemPedido> pedidoItens = new ArrayList<>();

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Date dataPedido, OrderStatus orderStatus, Cliente cliente) {

		this.dataPedido = dataPedido;
		this.orderStatus = orderStatus;
		this.cliente = cliente;

	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getPedidoItens() {
		return pedidoItens;
	}

	public void adicionarItem(ItemPedido item) {
		pedidoItens.add(item);
	}

	public void remover(ItemPedido item) {
		pedidoItens.remove(item);
	}
	
	public Double total() {
		double soma=0;
		
		for (ItemPedido itemPedido : pedidoItens) {
			soma += itemPedido.subTotal();
		}
		
		return soma;
	}

	@Override
	public String toString() {
	StringBuffer sb = new StringBuffer();
	sb.append("SUMARIO ORDER\n");
	sb.append("Data Atual " + sdf.format(dataPedido));
	sb.append("\nStatus: " + this.orderStatus);
	sb.append("\nCliente :" + this.getCliente().toString());
	sb.append("Itens:\n");
	
	for (ItemPedido itemPedido : pedidoItens) {
		sb.append(itemPedido.toString());
		
	}
	 sb.append("Total: " + total());
	
	
	return sb.toString();
	}
	
	

}

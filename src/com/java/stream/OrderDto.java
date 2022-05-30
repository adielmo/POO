package com.java.stream;

import java.math.BigDecimal;

public class OrderDto {
	
	private Long orderNumber;
	private Long customerId;
	private BigDecimal total;
	
	public OrderDto() {
		// TODO Auto-generated constructor stub
	}

	public OrderDto(Long orderNumber, Long customerId, BigDecimal total) {
	
		this.orderNumber = orderNumber;
		this.customerId = customerId;
		this.total = total;
	}

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "OrderDto [orderNumber=" + orderNumber + ", customerId=" + customerId + ", total=" + total + "]";
	}
	

}

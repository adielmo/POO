package com.java.enumeracao;

import java.util.Date;

public class Ordem {
	
	private Integer id;
	private Date data;
	private Status status;
	
	public Ordem() {
		// TODO Auto-generated constructor stub
	}

	public Ordem(Integer id, Date data, Status status) {
		super();
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ordem [id=" + id + ", data=" + data + ", status=" + status + "]";
	}
	
	

}

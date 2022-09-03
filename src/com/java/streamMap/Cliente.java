package com.java.streamMap;

public class Cliente {
	
	private String cpf;
	private String name;
	private boolean ativo =false;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String cpf, String name, boolean ativo) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.ativo = ativo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + this.cpf + ", name=" + this.name + ", ativo=" + this.ativo + "]";
	}

}

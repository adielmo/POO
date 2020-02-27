package com.java.generics.ex03;

import java.util.Date;

public class Login implements Comparable<Login> {

	private Long codigo;
	private String nome;
	private Date data;

	public Login() {

	}

	public Login(Long codigo, String nome, Date data) {
		this.codigo = codigo;
		this.nome = nome;
		this.data = data;
	}

	public Long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Login outro) {

		return this.codigo.compareTo(outro.getCodigo());
	}

	/*
	 * @Override public int compareTo(Login outro) {
	 * 
	 * return this.nome.toUpperCase().compareTo(outro.getNome().toUpperCase()); }
	 */

}

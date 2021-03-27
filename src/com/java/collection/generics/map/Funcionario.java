package com.java.collection.generics.map;

public class Funcionario {
	
	private int id;
	private String nome;
	private String dept;
	private int salario;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(int id, String nome, String dept, int salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.dept = dept;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", dept=" + dept + ", salario=" + salario + "]";
	}

	

}

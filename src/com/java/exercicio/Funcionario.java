package com.java.exercicio;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double taxa;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double calcularTaxa() {
		return this.salario -= (this.salario / this.taxa);
	}
	
	
	@Override
	public String toString() {
		return "Funcionario, Nome: " + this.nome + ", Salário: " + this.salario + ","
				+ " Taxa: " + this.taxa ;
	}
	
	

}

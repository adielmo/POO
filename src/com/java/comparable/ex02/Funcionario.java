package com.java.comparable.ex02;

public class Funcionario implements Comparable<Funcionario> {

	private Long cbo;
	private String cargo;
	private Long cargaHoraria;
	private Double pisoSalarial;
	private Double mediaSalarial;
	private Double salarioMediana;
	private Double tetoSalarial;
	private Double salarioHora;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Long cbo, String cargo, Long cargaHoraria, Double pisoSalarial, Double mediaSalarial,
			Double salarioMediana, Double tetoSalarial, Double salarioHora) {
	
		this.cbo = cbo;
		this.cargo = cargo;
		this.cargaHoraria = cargaHoraria;
		this.pisoSalarial = pisoSalarial;
		this.mediaSalarial = mediaSalarial;
		this.salarioMediana = salarioMediana;
		this.tetoSalarial = tetoSalarial;
		this.salarioHora = salarioHora;
	}

	public Long getCbo() {
		return cbo;
	}

	public void setCbo(Long cbo) {
		this.cbo = cbo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Long getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Long cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Double getPisoSalarial() {
		return pisoSalarial;
	}

	public void setPisoSalarial(Double pisoSalarial) {
		this.pisoSalarial = pisoSalarial;
	}

	public Double getMediaSalarial() {
		return mediaSalarial;
	}

	public void setMediaSalarial(Double mediaSalarial) {
		this.mediaSalarial = mediaSalarial;
	}

	public Double getSalarioMediana() {
		return salarioMediana;
	}

	public void setSalarioMediana(Double salarioMediana) {
		this.salarioMediana = salarioMediana;
	}

	public Double getTetoSalarial() {
		return tetoSalarial;
	}

	public void setTetoSalarial(Double tetoSalarial) {
		this.tetoSalarial = tetoSalarial;
	}

	public Double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(Double salarioHora) {
		this.salarioHora = salarioHora;
	}

	@Override
	public int compareTo(Funcionario outro) {

		return -this.cargo.compareTo(outro.cargo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.cbo + " ");
		sb.append(this.cargo + " ");
		sb.append(this.cargaHoraria + " ");
		sb.append(this.pisoSalarial + " ");
		sb.append(this.mediaSalarial + " ");
		sb.append(this.salarioMediana + " ");
		sb.append(this.tetoSalarial + " ");
		sb.append(this.salarioHora + " ");
		sb.append("");
		
		return sb.toString();
	}



}

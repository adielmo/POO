package com.java.enumeracao.ex;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
	
	private String nome;
	private NivelTrabalhador nivelTrabalhador;
    private Double baseSalario;
    
    private Departamento departamento;
    private List<ContratoHoras> contratoHoras = new ArrayList<>();
    
    public Trabalhador() {
		
    	}

	public Trabalhador(String nome, NivelTrabalhador nivelTrabalhador, Double baseSalario, Departamento departamento) {
		
		this.nome = nome;
		this.nivelTrabalhador = nivelTrabalhador;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivelTrabalhador() {
		return nivelTrabalhador;
	}

	public void setNivelTrabalhador(NivelTrabalhador nivelTrabalhador) {
		this.nivelTrabalhador = nivelTrabalhador;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHoras> getContratoHoras() {
		return contratoHoras;
	}
	

public void adicionarContrato(ContratoHoras contrato) {
	contratoHoras.add(contrato);
	
}

public void removerContrato(ContratoHoras contrato) {
	contratoHoras.remove(contrato);
}

public double renda(int ano, int mes){
	double soma = baseSalario;
Calendar calendar =  Calendar.getInstance();
	
for (ContratoHoras contrato : contratoHoras) {
	calendar.setTime(contrato.getData());
	
	int calendar_ano = calendar.get(Calendar.YEAR);
	int calendar_mes = 1 + calendar.get(calendar.MONTH);
	//int calendar_dia = calendar.get(calendar.DAY_OF_YEAR);
	
	if (mes == calendar_mes && ano == calendar_ano) {
	  soma +=contrato.valorTotal();	
	}
		
	}

return soma;
}
  
   
}
	

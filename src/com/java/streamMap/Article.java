package com.java.streamMap;

public class Article {
	
	private String name;
	private boolean ativo;
	
	
	public Article(String name, boolean ativo) {
		
		this.name = name;
		this.ativo = ativo;
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
		return "Article [name=" + name + ", ativo=" + ativo + "]";
	}
	
	

}

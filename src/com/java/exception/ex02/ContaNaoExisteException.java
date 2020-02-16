package com.java.exception.ex02;

public class ContaNaoExisteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ContaNaoExisteException(String msg) {
		super(msg);
	}
	

}

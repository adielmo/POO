package com.java.exception.ex02;

public class AgenciaOuContaExisteException extends Exception {

	private static final long serialVersionUID = 1L;
	
	 public AgenciaOuContaExisteException(String msg) {
		super(msg);
	}

}

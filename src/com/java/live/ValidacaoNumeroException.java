package com.java.live;

import java.util.InputMismatchException;

public class ValidacaoNumeroException extends InputMismatchException {

	private static final long serialVersionUID = 1L;

	public ValidacaoNumeroException(String msg) {
		super(msg);
	}

}

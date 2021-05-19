package com.java.testeInstaciof;

import com.java.TesteInstanceof.FilhoException;
import com.java.TesteInstanceof.PaiException;

public class TesteInstanceof {

	public static void main(String[] args) {
		FilhoException filhoException = new FilhoException("Instancia Filho!");
		PaiException paiException = new PaiException("Instancia Pai!");
		String nome = "Adielmo Rabelo Santos";
		Integer numero =462;
		
		 /*if (nome instanceof String) {
			System.out.println(nome);
		} else {
			System.out.println("Não é uma instancia.");
		}	*/	
		
            //Object      instancia    Type
		if (filhoException instanceof FilhoException) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		
		if (paiException instanceof Throwable) {
			System.out.println("paiException é uma instancia de FilhoException: " +true);
		} else {
			System.out.println("paiException não é instancia de FilhoException: " +false);
		} 
		 
	}

}

package com.java.stringRegex;
/**
 * 
 * @author Adielmo
 *
 */
public class Replece {
	
	/**
	 * Doc Regex:
	 * https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Guide/Regular_Expressions
	 */
	private static String replaceAll;

	public static void main(String[] args) {
		String frase = "Corinthians@ conhece &detalhes da semi-final da #Copa do Brasil,"
				        + " nesta sexta; saiba c#omo é o sor+teio;";
		
		
		
							 //frase.replaceAll("[#&*+-=()@]", "");
		
		/**
		 * Para Excluir esses caracteres especiais da 
		 *  frase e substituir por espaço vazio
		 */
		String replaceAll2 = frase.replaceAll("[#&*+-=()@;]", "");
		/**
		 * Para deixar somente essas letras na frase,
		 * e substituir por espaço vazio.
		 * [^ Aceitar somente essa condição for verdadeira]
		 */
		String replaceAll = frase.replaceAll("[^a-zA-Z ]", "");
		System.out.println(replaceAll2);
		System.out.println(replaceAll);
		
		/*
		 * while (frase ) {
		 * 
		 * }
		 */

	}

}

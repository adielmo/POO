package com.java.string;

public class StringModif {

	public static void main(String[] args) {
		
//substring(10) --> Retorna uma String apartir do index repassado			
String substrin ="Informações da entrega";

System.out.println(substrin.substring(10));
System.out.println(substrin.substring(10, 15));
System.out.println("==============//==============");

//indexOf(0) --> Qual posição está a letra IndexOf
System.out.println("Qual posição está a letra IndexOf: "+substrin.indexOf("õ"));
System.out.println("==============//==============");

//Join
System.out.println("==============//==============");


//replace( "q", "n") --> Substitir os caracter nessa String, o q pelo n
//replaceAll( "Regex", "") --> Utiliza no primeiro paramentro expressão Regex, pelo qual vai substitui 
String replaci= "e s p a ç o";
String join= "e s p a ç o";
System.out.println("IndexOf: "+ join.replace(" ", ""));

System.out.println(replaci);
System.out.println(replaci.replace("e", "E"));
System.out.println(replaci.replaceAll(" ", ""));
System.out.println("=============//==========");

//Split("-") --> Quebra quando o regex("-") for true
String texto ="Quebra quando o regex";
String[] tex= texto.split(" "); 

System.out.println("----------------//-------------");
for(String n : tex) {
	System.out.print(n + "=");
}
System.out.println(tex.length); 
				
	}

}

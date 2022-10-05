package com.java.stream08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste1 {

	public static void main(String[] args) throws IOException {
List<Integer> listNum =
	Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

listNum.stream()
       .skip(1)
       .limit(7)
       .forEach(x ->{
    	   System.out.print(x+", ");
       });

System.out.println("\n"+"======================================");

List<String> readAllLines = Files.readAllLines(Paths.get("C:\\Users\\Escritorio 01\\Downloads\\Rede\\projetoJavaTwlio\\data.txt"));
//System.out.println(readAllLines.size()); 
readAllLines.forEach(x ->{
	System.out.println(x);
});
	}

}

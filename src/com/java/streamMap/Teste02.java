package com.java.streamMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Teste02 {
	
	public static void main(String[] args) {
List<Article> articles = Arrays.asList(
	new Article("Baeldung", true),new Article("Baeldung", false),new Article("Programming Daily", false),
	new Article("The Code", false),new Article("Java", true), new Article("Pyton", false),
	new Article("Spring ", false), new Article("Quarkus", false),new Article("The Code", false),
	new Article("Java", true),new Article("Pyton", false),new Article("Spring ", false),
	new Article("Quarkus", false), new Article("Java", true),new Article("Spring", true));

Map<Boolean, List<Article>> convListToMap = convListToMap(articles);
Map<String, List<Article>> listToMap = listToMap(articles);
countCourse(articles);

for(Map.Entry<Boolean, List<Article>> entry : convListToMap.entrySet()) {
	System.out.println("Key: " +entry.getKey()+   
	                   " Value: "+entry.getValue());
}
System.out.println("================//===================");
for(Map.Entry<Boolean, List<Article>> entry : convListToMap.entrySet()) {
	System.out.println("Key: " +entry.getKey()+   
	                   " Value: "+entry.getValue());
}

System.out.println("================//===================");

Map<String, Integer> countCourse = countCourse(articles);
countCourse.forEach((key, value)-> {
	System.out.println("Nome Curso: "+ key + " Qtd: "+value);
});

System.out.println("================//===================");

Map<Boolean, Integer> countCourseBoolean = countCourseBoolean(articles);
countCourseBoolean.entrySet().forEach(entry -> {
	System.out.println("Type: "+entry.getKey() + " Value:"+entry.getValue());
});

	}
	
	@SuppressWarnings("unlikely-arg-type")
	private static Map<Boolean, Integer> countCourseBoolean(List<Article> articles) {
		Map<Boolean, Integer> mapCourseCountBoolean = new HashMap<>();
		
		articles.forEach(article -> {
			if (!mapCourseCountBoolean.containsKey(article.isAtivo())) {
				mapCourseCountBoolean.put(article.isAtivo(), 1);
			}else {
				mapCourseCountBoolean.entrySet().forEach(entry ->{
				mapCourseCountBoolean.put(article.isAtivo(), entry.getValue()+1);	
				});
			}
		});
		return mapCourseCountBoolean;
	}

	private static Map<String, Integer> countCourse(List<Article> articles) {
		Map<String, Integer> mapCourseCount = new HashMap<>();
		
		articles.stream().forEach(x ->{
			if (!mapCourseCount.containsKey(x.getName())) {
				mapCourseCount.put(x.getName(), 1);
			}else {
				
				mapCourseCount.entrySet().forEach(entry -> {
					mapCourseCount.put(x.getName(), entry.getValue()+1);
				});
				              
				/*for (Map.Entry<String, Integer> entry : mapCourseCount.entrySet()) {
					//String key = entry.getKey();
					//Integer val = entry.getValue();
					
					mapCourseCount.put(x.getName(), entry.getValue()+1);
					
				}*/
			
			}
		});
		return mapCourseCount;
		
	}

	private static Map<String, List<Article>> listToMap(List<Article> articles) {
		Map<String, List<Article>> mapsArticles = new HashMap<>();
		
	mapsArticles= articles.stream()
		 .collect(Collectors.groupingBy(x ->x.getName()));
		
		
		
		return mapsArticles;
		
	}
	

	private static Map<Boolean, List<Article>> convListToMap(List<Article> articles) {
		Map<Boolean, List<Article>> mapsArticles = new HashMap<>();
		
	mapsArticles= articles.stream()
		 .collect(Collectors.partitioningBy(x ->x.getName().equalsIgnoreCase("Baeldung")));
		
		
		
		return mapsArticles;
		
	}
	/*
	 * public static Map.Entry<String, Integer> iterateStreamAPI(Map<String,
	 * Integer> map) { map.entrySet().stream().forEach(e -> {
	 * System.out.println(e.getKey() + ":"+e.getValue()); }); }
	 */


}

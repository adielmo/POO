package com.java.streamMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Teste03 {

	public static void main(String[] args) {
		List<Article> articles = Arrays.asList(
				new Article("Baeldung", true),new Article("Baeldung", false),new Article("Programming Daily", false),
				new Article("The Code", false),new Article("Java", true), new Article("Pyton", false),
				new Article("Spring ", false), new Article("Quarkus", false),new Article("The Code", false),
				new Article("Java", true),new Article("Pyton", false),new Article("Spring ", false),
				new Article("Quarkus", false), new Article("Java", true),new Article("Spring", true));
		
		Map<Integer, Article> map = listToMap(articles);
		Map<Integer, Article> mapType = listToMapTypeTrue(articles);
		System.out.println("--------------------//----------------------");
		map.entrySet().forEach(x ->{
			System.out.println("Key: "+x.getKey()+ " Value: "+ x.getValue());
		});;
		
		System.out.println("--------------------//----------------------");
		mapType.entrySet().forEach(x ->{
			System.out.println("Key: "+x.getKey()+ " Value: "+ x.getValue());
		});;
		System.out.println("--------------------Set--//--Sort----------------------");
		Collection<Article> mapToSet = mapToSet(articles);
		mapToSet		      
		      .forEach(x ->{
			System.out.println("Curso: "+x.getName() + " Type: "+x.isAtivo());
		});
	}
	private static List<Article> mapToSet(List<Article> t){
	
		Map<Integer, Article> listToMapTypeTrue = listToMap(t);
		List<Article> list = new ArrayList<>(listToMapTypeTrue.values());
		//listToMapTypeTrue.entrySet().stream().forEach(null);
		
		
		return list.stream()
				 .filter(distinctByKey(Article::getName))
				 .sorted(Comparator.comparing(Article::getName)/* .reversed() */)
				 .collect(Collectors.toList());
	}
	private static Map<Integer, Article> listToMapTypeTrue(List<Article> articles) {
		Map<Integer, Article> map =  new HashMap<>();
		Integer count=0;
		List<Article> collect = articles.stream().filter(x -> !x.isAtivo()).collect(Collectors.toList());
		      for (Article article : collect) {
		    	  count+=1;
				map.put(count, article);
			}           
		return map;
	}

	private static Map<Integer, Article> listToMap(List<Article> articles) {
		Integer count=1;
		Map<Integer, Article> map =  new HashMap<>();
		
		for (Article article : articles) {
			map.put(count, article);
			count+=1;
		}
		 
		
		/*
		 * for (int i = 0; i < articles.size(); i++) { 
		 * map.put(i+1, articles.get(i)); 
		 * }
		 */
		 return map;
	}
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		    Set<Object> seen = ConcurrentHashMap.newKeySet();
		    return t -> seen.add(keyExtractor.apply(t));
		}
	

}

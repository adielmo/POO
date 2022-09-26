package com.java.streamMap;

public class Book {
	
private String name;
private int releaseYear;
private String isbn;

public Book() {
	// TODO Auto-generated constructor stub
}
public Book(String name, int releaseYear, String isbn) {
	super();
	this.name = name;
	this.releaseYear = releaseYear;
	this.isbn = isbn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getReleaseYear() {
	return releaseYear;
}
public void setReleaseYear(int releaseYear) {
	this.releaseYear = releaseYear;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}



}

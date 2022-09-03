package com.java.vetor;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Student {
	private Double id;
	private Set<String> sets;
	private List<Integer> lists;
	private String[] vetors;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Double id, Set<String> sets, List<Integer> lists, String[] vetors) {
		super();
		this.id = id;
		this.sets = sets;
		this.lists = lists;
		this.vetors = vetors;
	}

	public Double getId() {
		return this.id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public List<Integer> getLists() {
		return lists;
	}

	public void setLists(List<Integer> lists) {
		this.lists = lists;
	}

	public String[] getVetors() {
		return vetors;
	}

	public void setVetors(String[] vetors) {
		this.vetors = vetors;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sets=" + sets + ", lists=" + lists + ", vetors=" + Arrays.toString(vetors)
				+ "]";
	}

}

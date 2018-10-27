package com.wxx.designpattern.structural.filter;

public class Consumer {
	private String name;
	private int existsYears;
	private int star;
	private int combos;

	public Consumer(String name, int existsYears, int star, int combos) {
		this.name = name;
		this.existsYears = existsYears;
		this.star = star;
		this.combos = combos;
	}

	public String getName() {
		return name;
	}
	public int getExistsYears() {
		return existsYears;
	}
	public int getStar() {
		return star;
	}
	public int getCombos() {
		return combos;
	}

}

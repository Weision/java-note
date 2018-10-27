package com.wxx.designpattern.behavioral.memento;

public class History {
	private String thing;
	public History(String thing) {
		this.thing = thing;
	}

	public String getThing() {
		return thing;
	}
}

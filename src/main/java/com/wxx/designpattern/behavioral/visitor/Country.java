package com.wxx.designpattern.behavioral.visitor;

public abstract class Country {
	// 使民族统一
	public abstract void uniteNation();

	// 并肩作战
	public abstract void fightWith(Visitor visitor);
}
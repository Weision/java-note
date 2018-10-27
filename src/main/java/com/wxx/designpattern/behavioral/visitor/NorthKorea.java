package com.wxx.designpattern.behavioral.visitor;

public class NorthKorea extends Country {

	@Override
	public void fightWith(Visitor visitor) {
		visitor.intervene(this);
	}

	@Override
	public void uniteNation() {
		System.out.println("---------------------朝鲜民主主义人民共和国---------------------");
		System.out.println("朝鲜民主主义人民共和国:为了民族统一，为了共产主义而战~");
	}
}

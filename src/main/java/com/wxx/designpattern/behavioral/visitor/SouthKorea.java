package com.wxx.designpattern.behavioral.visitor;

public class SouthKorea extends Country {

	@Override
	public void fightWith(Visitor visitor) {
		visitor.intervene(this);
	}

	@Override
	public void uniteNation() {
		System.out.println("---------------------------大韩民国--------------------------");
		System.out.println("大韩民国：宇宙是我们的思密达~");
	}
}

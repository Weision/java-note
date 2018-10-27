package com.wxx.designpattern.structural.facade;

public class Barista {
	// 挑选咖啡豆
	private Screening screening = new Screening();
	// 对咖啡豆进行烘焙
	private Baking baking = new Baking();
	// 磨咖啡豆
	private Grind grind = new Grind();
	// 煮咖啡
	private Boil boil = new Boil();

	public void makeCofe() {
		// 开始制作
		screening.screening();
		baking.baking();
		grind.grind();
		boil.boil();
		System.out.println("做出来的不仅仅是一杯的咖啡，更是艺术品~");
	}
}

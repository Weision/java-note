package com.wxx.designpattern.creational.builder;

public class Client {

	public static void main(String[] args) {

		// 发法执行人:申不害
		Builder shenBuHai = new ShenBuHaiBuilder();
		// 发法执行人:商鞅
		Builder shangYang = new ShangYangBuilder();

		// 诸侯
		King king = new King();
		// 诸侯授权执行变法

		Country han = king.authorizeConstruct(shenBuHai);
		Country qin = king.authorizeConstruct(shangYang);

		han.showPower();
		qin.showPower();
	}

}

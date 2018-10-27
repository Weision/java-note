package com.wxx.designpattern.structural.composite;

public class SunWuKong implements ShenXian {
	private final static String name = "齐天大圣 孙悟空";
	// 弼马温 职责 养马
	private final String duty = "养马";

	@Override
	public void dealProblem() {
		System.out.println("孙悟空:你让老子给你看马 老子不干了");
	}

	@Override
	public String getDuty() {
		return duty;
	}

	@Override
	public String getName() {
		return name;
	}

}

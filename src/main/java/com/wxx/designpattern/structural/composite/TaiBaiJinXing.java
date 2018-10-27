package com.wxx.designpattern.structural.composite;

public class TaiBaiJinXing implements ShenXian {
	private final static String name = "太白金星";
	// 天白金星 职责是 和事老 调解
	private final String duty = "调解";

	@Override
	public String getDuty() {
		return duty;
	}

	@Override
	public void dealProblem() {
		System.out.println("太白金星:大事化小 小事化了~");
	}

	@Override
	public String getName() {
		return name;
	}

}

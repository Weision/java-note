package com.wxx.designpattern.structural.composite;

public class ChangE implements ShenXian {
	private final static String name = "嫦娥";
	// 嫦娥
	private final String duty = "孤独的养着兔子";

	@Override
	public void dealProblem() {
		System.out.println("胡萝卜又没了");
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

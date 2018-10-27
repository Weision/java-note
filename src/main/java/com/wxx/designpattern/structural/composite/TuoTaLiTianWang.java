package com.wxx.designpattern.structural.composite;

public class TuoTaLiTianWang implements ShenXian {
	private final static String name = "托塔李天王";
	// 托塔李天王 职责是 打的你满地找牙
	private final String duty = "打";

	@Override
	public String getDuty() {
		return duty;
	}

	@Override
	public void dealProblem() {
		System.out.println("托塔李天王:我保证不打死你~");
	}

	@Override
	public String getName() {
		return name;
	}

}

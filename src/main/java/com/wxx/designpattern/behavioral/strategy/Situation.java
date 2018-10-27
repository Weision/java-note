package com.wxx.designpattern.behavioral.strategy;
/**
 * 上下文角色
 */
public class Situation {
	private String situationInfo;
	private SilkBag silkBag;
	public Situation(SilkBag silkBag, String situationInfo) {
		this.silkBag = silkBag;
		this.situationInfo = situationInfo;
	}
	public void solveProblem() {
		System.out.println("当时的情况是这样的：" + situationInfo);
		silkBag.solveProblem();
	}
}

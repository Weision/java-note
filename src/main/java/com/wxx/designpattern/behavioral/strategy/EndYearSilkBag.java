package com.wxx.designpattern.behavioral.strategy;

public class EndYearSilkBag implements SilkBag{

	@Override
	public void solveProblem() {
		System.out.println("年底锦囊打开：赵云向刘备报告：曹操兴兵50 万报赤壁之仇，荆州危急，主公要赶快回去；刘备大惊，准备回荆州。");
	}

}

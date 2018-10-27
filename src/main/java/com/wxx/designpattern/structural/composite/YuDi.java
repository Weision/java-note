package com.wxx.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 玉皇大帝 相当于枝干 掌管天庭人员 事物 
 * 天庭诸神 相当于叶子 听从玉帝命令
 */
public class YuDi implements ShenXian {
	private final static String name = "玉皇大帝";
	// 玉帝职责是 管理者
	private final String duty = "管理";
	// 组合模式关键所在 组合了一个神仙接口的list
	List<ShenXian> shen = new ArrayList<ShenXian>();

	@Override
	public String getDuty() {
		return duty;
	}

	// 掌管三界，统领天庭
	@Override
	public void dealProblem() {
		System.out.println("掌管三界，统领天庭");
	}

	// 招纳神仙
	public void addShen(ShenXian s) {
		shen.add(s);
		System.out.println("天庭吸收了一位新成员[" + s.getName() + "]");
	}

	// 罢免官员
	public void deleteShen(ShenXian s) {
		shen.remove(s);
		System.out.println("天庭删除了一位成员[" + s.getName() + "]");

	}

	// 对外提供 花名册
	public List<ShenXian> getShenList() {
		return shen;
	}

	@Override
	public String getName() {
		return name;
	}
}

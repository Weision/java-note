package com.wxx.designpattern.structural.composite;

/**
 * 神仙接口 
 * 为了演示组合模式就归为一个概念了(神特指凡人死后元神升天成神，仙是凡人活体飞升，神和仙不是一个概念)
 */
public interface ShenXian {
	// 神仙处理问题
	void dealProblem();

	// 获取神仙职责
	String getDuty();

	// 获取神仙的名字
	String getName();
}

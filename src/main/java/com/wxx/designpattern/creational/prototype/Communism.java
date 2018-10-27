package com.wxx.designpattern.creational.prototype;

/**
 * 制定规矩
 */
public interface Communism extends Cloneable {

	// 可以被模仿 从未被超越
	public Communism getClone();

	// 走中国特色社会主义道路
	public Communism deepClone();

	// 你的追求
	public String getBelief();

	// 报上你的情况 为了演示 浅克隆 深克隆
	public NationalSituation getNationalSituation();
}

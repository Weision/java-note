package com.wxx.designpattern.creational.abstractfactory;

public class JzrFreighterFactory extends AbstractWorldFactory {
	private Product freighter;

	// 获取产品
	@Override
	public Product getProduct(String type) {
		freighter = productSteel(type);
		return freighter;
	}

	// 生产过程
	private Product productSteel(String type) {
		return new Freighter();
	}

}

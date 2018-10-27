package com.wxx.designpattern.creational.abstractfactory;

public class JznBreadFactory extends AbstractWorldFactory {
	private Product bread;

	// 获取产品
	@Override
	public Product getProduct(String type) {
		bread = productSteel(type);

		return bread;
	}

	// 生产过程
	private Product productSteel(String type) {
		if ("肉松面包".equals(type)) {
			return new Bread();
		} else {
			return new HamBread();
		}
	}
}

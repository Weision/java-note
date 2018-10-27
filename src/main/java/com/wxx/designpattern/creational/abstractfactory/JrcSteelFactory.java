package com.wxx.designpattern.creational.abstractfactory;

public class JrcSteelFactory extends AbstractWorldFactory {
	private Product steel;

	// 获取产品
	@Override
	public Product getProduct(String type) {
		steel = productSteel(type);
		return steel;
	}

	// 生产过程
	private Product productSteel(String type) {
		return new Steel();
	}

}

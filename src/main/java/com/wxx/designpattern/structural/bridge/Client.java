package com.wxx.designpattern.structural.bridge;

public class Client {

	public static void main(String[] args) {

		AbstractBridgeProduct xm = new FactoryProduct(new XiaoMi());
		AbstractBridgeProduct cz = new FactoryProduct(new ChuiZi());

		xm.productMobile();
		cz.productMobile();
	}

}

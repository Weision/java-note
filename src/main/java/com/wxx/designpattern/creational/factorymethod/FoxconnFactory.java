package com.wxx.designpattern.creational.factorymethod;

public class FoxconnFactory {
	public MobilePhone getProduct(String brand) {
		if ("小米".equals(brand)) {
			return new XiaoMi();
		} else if ("锤子".equals(brand)) {
			return new ChuiZi();
		} else {
			return new HuaWei();
		}
	}
}

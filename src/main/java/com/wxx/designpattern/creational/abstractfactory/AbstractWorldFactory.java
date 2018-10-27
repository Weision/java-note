package com.wxx.designpattern.creational.abstractfactory;

public abstract class AbstractWorldFactory {
	public static AbstractWorldFactory getFactory(String productType) {
		if ("轮船".equals(productType)) {
			return new JzrFreighterFactory();
		} else if ("钢材".equals(productType)) {
			return new JrcSteelFactory();
		} else {
			return new JznBreadFactory();
		}
	}
	//生产产品的任务交给具体的工厂 
	//入参type 是为了选择同一产品族中不同的产品
	public abstract Product getProduct(String type);
}

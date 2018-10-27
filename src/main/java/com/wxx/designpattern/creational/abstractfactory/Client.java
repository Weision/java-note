package com.wxx.designpattern.creational.abstractfactory;

public class Client {

	public static void main(String[] args) {
		//轮船厂
		AbstractWorldFactory freighterFactory = AbstractWorldFactory.getFactory("轮船");
		Product freighter = freighterFactory.getProduct("万吨轮船");
		freighter.use();
		//钢铁厂
		AbstractWorldFactory stealFactory = AbstractWorldFactory.getFactory("钢材");
		Product steal = stealFactory.getProduct("高强度钢");
		steal.use();
		//面包厂
		AbstractWorldFactory breadFactory = AbstractWorldFactory.getFactory("面包");
		Product bread = breadFactory.getProduct("肉松面包");
		Product hamBread = breadFactory.getProduct("火腿面包");
		bread.use();
		hamBread.use();
	}

}

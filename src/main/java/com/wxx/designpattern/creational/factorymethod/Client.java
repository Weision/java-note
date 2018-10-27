package com.wxx.designpattern.creational.factorymethod;

public class Client {

	public static void main(String[] args) {
		FoxconnFactory factory = new FoxconnFactory();
		MobilePhone xiaomi = factory.getProduct("小米");
		MobilePhone chuizi = factory.getProduct("锤子");
		MobilePhone huawei = factory.getProduct("华为");
		xiaomi.use();
		chuizi.use();
		huawei.use();
	}
}

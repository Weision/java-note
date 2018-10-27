package com.wxx.designpattern.creational.factorymethod;

public class XiaoMi extends MobilePhone {
	public XiaoMi() {
		System.out.println("小米手机研发中--经过2年研发 70道工序打造而成。");
	}

	@Override
	public void use() {
		System.out.println("-- 雷布斯欢迎你使用小米手机 -- ");
	}
}

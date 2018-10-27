package com.wxx.designpattern.creational.factorymethod;

public class ChuiZi extends MobilePhone {
	public ChuiZi() {
		System.out.println("锤子手机研发中--千呼万唤始出来，犹抱琵琶半遮面。");
	}

	@Override
	public void use() {
		System.out.println("-- 锤子手机拯救世界 -- ");
	}
}

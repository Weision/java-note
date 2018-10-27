package com.wxx.designpattern.creational.factorymethod;

public class HuaWei extends MobilePhone {
	public HuaWei() {
		System.out.println("华为手机研发中--老子是世界500强。 ");
	}

	@Override
	public void use() {
		System.out.println("-- 华为--不仅仅是世界500强 -- ");
	}
}

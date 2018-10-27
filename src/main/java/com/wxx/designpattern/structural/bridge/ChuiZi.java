package com.wxx.designpattern.structural.bridge;

public class ChuiZi implements MobilePhone {
	private final String name = "坚果Pro3";

	public ChuiZi() {
		System.out.println("锤子手机:工匠雕琢~~！");
		System.out.println("----------------[" + name + "]研发结束-----------------");
	}

	public String getName() {
		return name;
	}
}

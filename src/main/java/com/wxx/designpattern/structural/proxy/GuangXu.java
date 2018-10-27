package com.wxx.designpattern.structural.proxy;

public class GuangXu implements Emperor {
	public GuangXu() {
		System.out.println("我是光绪皇帝，我旁边坐着慈溪太后");
	}

	@Override
	public void dealThings(String thing) {
		System.out.println("光绪看着关于[" + thing + "]的奏折，无奈的摇了摇头。");
	}

}

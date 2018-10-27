package com.wxx.designpattern.behavioral.observer;

public class HuangSir extends AbstractObserver {

	@Override
	public void sendIntelligence() {
		System.out.println("--------镜头三-------");
		System.out.println("从监控中看到了韩琛他们在密谈，又收到了陈永仁发来的收货地址，命令手下抓人～");
	}

}

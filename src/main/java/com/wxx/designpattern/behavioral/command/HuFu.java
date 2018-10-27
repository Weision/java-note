package com.wxx.designpattern.behavioral.command;

public class HuFu extends Command {
	private BaiQi baiQi;
	
	public HuFu(BaiQi baiQi) {
		System.out.println("--具体命令角色--虎符--秦昭襄王將虎符交給白起");
		this.baiQi = baiQi;
	}

	@Override
	public void takeOrder() {
		baiQi.fight();
	}

}

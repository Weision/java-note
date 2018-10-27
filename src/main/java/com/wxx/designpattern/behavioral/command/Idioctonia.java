package com.wxx.designpattern.behavioral.command;

public class Idioctonia extends Command {
	private BaiQi baiQi;

	public Idioctonia(BaiQi baiQi) {
		System.out.println("--具体命令角色--自刎--秦昭襄王派使者赐剑命白起自刎");
		this.baiQi = baiQi;
	}

	@Override
	public void takeOrder() {
		baiQi.ziWen();
	}

}

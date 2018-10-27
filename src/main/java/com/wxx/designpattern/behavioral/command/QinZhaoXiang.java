package com.wxx.designpattern.behavioral.command;

public class QinZhaoXiang {
	private Command command;

	public void setHufu(Command command) {
		this.command = command;
	}

	// 秦昭襄王
	public void makeDecision() {
		System.out.println("--调用者角色--秦昭襄王作出一個艰难的決定：");
		command.takeOrder();
	}
}

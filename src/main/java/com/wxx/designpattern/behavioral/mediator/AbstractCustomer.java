package com.wxx.designpattern.behavioral.mediator;

public abstract class AbstractCustomer {
	// 客户名
	protected String name;
	// 账户默认100元
	protected int account = 100;

	// 心情
	protected String mood;

	// 事件方法
	public abstract void deal(AbstractMediator taoBao, String doSomeThing, int money);

	public String getName() {
		return name;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public int getAccount() {
		return account;
	}

}

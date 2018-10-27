package com.wxx.designpattern.structural.flyweight;

public abstract class AbstractThread {
	// 线程内部状态
	protected String threadName;

	public AbstractThread(String threadName) {
		this.threadName = threadName;
	}

	// 线程外部状态
	public void threadStatus(String threadStatus) {
		System.out.println(threadName + "当前外部状态为:" + threadStatus);
	}

	public abstract void excute();
}

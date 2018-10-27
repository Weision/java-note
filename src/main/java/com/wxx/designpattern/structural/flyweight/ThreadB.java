package com.wxx.designpattern.structural.flyweight;

public class ThreadB extends AbstractThread {

	public ThreadB(String threadName) {
		super(threadName);
	}

	@Override
	public void excute() {
		System.out.println("线程[" + threadName + "]开始执行任务~");
	}

}

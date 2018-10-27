package com.wxx.designpattern.structural.flyweight;

public class Client {
	public static void main(String[] args) {
		// 获取享元工厂
		ThreadFactory threadFactory = ThreadFactory.getThreadFactory();
		// 获取共享元素
		AbstractThread thread1 = threadFactory.getThread("A");
		AbstractThread thread2 = threadFactory.getThread("B");
		// 获取新元素
		AbstractThread thread3 = threadFactory.getThread("C");
		// 线程执行任务
		thread1.excute();
		thread2.excute();
		thread3.excute();

		AbstractThread thread4 = threadFactory.getThread("A");
		// thread1和thread4获取的是同一个实例
		if (thread1 == thread4) {
			System.out.println("thread1 == thread4");
		}
	}
}

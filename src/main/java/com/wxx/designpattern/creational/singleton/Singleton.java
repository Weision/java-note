package com.wxx.designpattern.creational.singleton;

/**
 * 单例模式 饿汉模式
 */
public class Singleton {

	// 饿汉模式 创建 Singleton 的一个对象
	private static Singleton singleton = new Singleton();

	// 让构造函数为 private，这样该类就不会被实例化
	private Singleton() {
	}

	// 获取唯一可用的对象
	public static Singleton getInstance() {
		return singleton;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

}

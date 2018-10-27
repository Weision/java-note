package com.wxx.designpattern.creational.singleton;

/**
 * 单例模式 最简单的懒汉模式
 */
public class SingletonLazy {

	private static SingletonLazy singletonLazy;

	private SingletonLazy() {
	}

	public static SingletonLazy getInstance() {
		singletonLazy = new SingletonLazy();
		return singletonLazy;
	}

	public void showMessage() {
		System.out.println("Hello World! I`m Miss Lazy~");
	}

}

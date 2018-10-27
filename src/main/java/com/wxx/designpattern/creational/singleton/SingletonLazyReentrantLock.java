package com.wxx.designpattern.creational.singleton;

import java.util.concurrent.locks.ReentrantLock;

public class SingletonLazyReentrantLock {
	private static SingletonLazyReentrantLock singletonLazyReentrantLock;
	private static ReentrantLock lock = new ReentrantLock();;

	private SingletonLazyReentrantLock() {
	}

	public static SingletonLazyReentrantLock getInstance() {
		lock.lock();
		if (null == singletonLazyReentrantLock) {
			singletonLazyReentrantLock = new SingletonLazyReentrantLock();
		}
		lock.unlock();
		return singletonLazyReentrantLock;
	}
	public void showMessage() {
		System.out.println("Hello World! I`m Miss Lazy ReentrantLock~");
	}
}

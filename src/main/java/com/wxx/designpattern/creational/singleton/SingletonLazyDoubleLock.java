package com.wxx.designpattern.creational.singleton;

/*是否 Lazy 初始化：是
是否多线程安全：是
实现难度：较复杂
描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
getInstance() 的性能对应用程序很关键。*/
public class SingletonLazyDoubleLock {

	private volatile static SingletonLazyDoubleLock singleton;

	private SingletonLazyDoubleLock() {

	}

	public static synchronized SingletonLazyDoubleLock getInstance() {
		if (singleton == null) {
			synchronized (SingletonLazyDoubleLock.class) {
				if (singleton == null) {
					singleton = new SingletonLazyDoubleLock();
				}
			}

		}
		return singleton;
	}
	
	public void showMessage() {
		System.out.println("Hello World! I`m Miss Lazy DoubleLock~");
	}
}

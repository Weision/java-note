package com.wxx.designpattern.creational.singleton;

public class SingletonLazySynchronized {

	/*
	 * 是否 Lazy 初始化：是 是否多线程安全：否 实现难度：易 描述：这种方式具备很好的 lazy
	 * loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。 优点：第一次调用才初始化，避免内存浪费。 缺点：必须加锁
	 * synchronized 才能保证单例，但加锁会影响效率。 getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
	 */
	private static SingletonLazySynchronized singletonLazy;

	private SingletonLazySynchronized() {

	}

	public static synchronized SingletonLazySynchronized getInstance() {
		if (singletonLazy == null) {
			singletonLazy = new SingletonLazySynchronized();
		}
		return singletonLazy;
	}

	public void showMessage() {
		System.out.println("Hello World! I`m Miss Lazy Synchronized~");
	}
}

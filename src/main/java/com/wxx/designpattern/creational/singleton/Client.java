package com.wxx.designpattern.creational.singleton;

/**
 * 调用者
 * 
 * @author weixx
 *
 */
public class Client {
	public static void main(String[] args) {
		// 调用构造器会报错
		// Singleton s = new Singleton();

		// 调用其静态方法获取实例
		Singleton instance = Singleton.getInstance();
		instance.showMessage();
		// 调用其静态方法获取实例 懒加载 加锁
		SingletonLazy instanceLazy = SingletonLazy.getInstance();
		instanceLazy.showMessage();

		// 调用其静态方法获取实例 懒加载 加锁
		SingletonLazySynchronized instanceLazySynchronized = SingletonLazySynchronized.getInstance();
		instanceLazySynchronized.showMessage();

		// 调用其静态方法获取实例 懒加载 重入锁
		SingletonLazyReentrantLock instanceLazyReentrant = SingletonLazyReentrantLock.getInstance();
		instanceLazyReentrant.showMessage();

		// 调用其静态方法获取实例 懒加载 双锁机制
		SingletonLazyDoubleLock instanceLazyDcl = SingletonLazyDoubleLock.getInstance();
		instanceLazyDcl.showMessage();

		// 调用其静态方法获取实例 懒加载 内部类 类加载时单线程机制
		SingletonLazyInnerClass instanceLazyInner = SingletonLazyInnerClass.getInstance();
		instanceLazyInner.showMessage();
	}
}

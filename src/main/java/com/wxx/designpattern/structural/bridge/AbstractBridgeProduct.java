package com.wxx.designpattern.structural.bridge;

/**
 * 桥接抽象类
 * 
 * @author Administrator
 *
 */
public abstract class AbstractBridgeProduct {

	protected MobilePhone re;

	// 无论是构造器 还是set方法 只要注入就好
	public AbstractBridgeProduct(MobilePhone re) {
		this.re = re;
	}

	public abstract void productMobile();
}

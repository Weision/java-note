package com.wxx.designpattern.behavioral.iterator;

/**
 * 迭代器接口
 */
public interface Iterator {
	// 是否存在下一个
	public boolean hasNext();

	// 获取下一本书
	public Book next();
}

package com.wxx.designpattern.behavioral.iterator;

/**
 * 书架迭代器
 */
public class BookShelfIterator implements Iterator {
	// 聚合的书架
	private BookShelf bookShelf;
	// 遍历书架数组的索引
	private int index;

	// 通过构造器注入
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (this.bookShelf.getLength() > index)
			return true;
		else
			return false;
	}

	@Override
	public Book next() {
		Book bookAt = bookShelf.getBook(index);
		index++;
		return bookAt;
	}
}

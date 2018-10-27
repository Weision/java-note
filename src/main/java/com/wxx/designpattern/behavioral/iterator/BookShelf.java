package com.wxx.designpattern.behavioral.iterator;

/**
 * 具体的集合 书架
 */
public class BookShelf implements Aggregate {
	//集合的真实数据结构为数组 不对外展示
	private Book[] books;
	private int index = 0;

	// 好多集合类 都有默认值 超过默认值会扩容
	public BookShelf(int maxSize) {
		// 给数组指定长度
		books = new Book[maxSize];
	}

	// 添加书
	public void addBook(Book book) {
		books[index] = book;
		index++;
	}

	// 通过索引来获取指定的书
	public Book getBook(int index) {
		return books[index];
	}

	// 获取数组长度
	public int getLength() {
		return books.length;

	}

	// 获取书架迭代器
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}

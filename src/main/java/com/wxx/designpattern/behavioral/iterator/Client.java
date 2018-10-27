package com.wxx.designpattern.behavioral.iterator;

public class Client {
	public static void main(String[] args) {
		// 去市场买了个书架
		BookShelf bs = new BookShelf(5);
		// 往书架上添加书
		bs.addBook(new Book("Java 从入门到放弃"));
		bs.addBook(new Book("MySQL 从删库到跑路"));
		bs.addBook(new Book("函数式编程 从入门到懵逼"));
		bs.addBook(new Book("算法概论 从入门到改行"));
		bs.addBook(new Book("僵尸生存法则"));

		// 获取书架的迭代器
		Iterator iterator = bs.iterator();

		// 通过迭代器来遍历书架
		while (iterator.hasNext()) {
			Book book = iterator.next();
			System.out.println(book.getName());
		}
	}
}

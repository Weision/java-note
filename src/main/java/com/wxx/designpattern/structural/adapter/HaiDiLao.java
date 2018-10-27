package com.wxx.designpattern.structural.adapter;

public class HaiDiLao implements HuoGuo {

	@Override
	public void eat(String whitchOne) {
		// 麻辣锅
		if ("麻辣".equals(whitchOne)) {
			maLa();
		}
		// 三鲜锅
		if ("三鲜".equals(whitchOne)) {
			sanXian();
		}
		// 鸳鸯戏水锅
		if ("鸳鸯".equals(whitchOne)) {
			yuanYang();
		}
		// 情节需要
		System.out.println("吃了一个粉带后，她放下筷子~");

	}

	private void maLa() {
		System.out.println("麻辣锅，今天上边爽，明天下边爽~");
	}

	private void sanXian() {
		System.out.println("三鲜锅，我吃的不是味道，而是菜~");
	}

	private void yuanYang() {
		System.out.println("鸳鸯锅，想吃哪个吃那个~");
	}
}

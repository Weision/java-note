package com.wxx.designpattern.structural.adapter;

public class XiaoJiu implements HuoGuo {

	@Override
	public void eat(String whitchOne) {
		// 小九火锅只提供九宫格
		if ("九宫格".equals(whitchOne)) {
			jiuGongGe();
		}
	}

	private void jiuGongGe() {
		System.out.println("九宫格，九宫格,想放哪格放哪格~");
		// 情节需要
		System.out.println("吃了一个鱼丸后，她放下筷子~");
	}
}

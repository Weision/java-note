package com.wxx.designpattern.behavioral.observer;

public class Client {

	public static void main(String[] args) {
		System.out.println("剧情: 韩琛出场");
		AbstractRingleader hanChen = new HanChen();
		System.out.println("剧情: 陈永仁 跟着 韩琛");
		AbstractObserver chenYongRen = new ChenYongRen();
		System.out.println("剧情: 黄Sir 在对面楼上注视着交易现场");
		AbstractObserver hanSir = new HuangSir();
		System.out.println("-------------------");
		System.out.println("剧情: 韩琛在不知道的情况下被监视");
		hanChen.addobservers(chenYongRen);
		hanChen.addobservers(hanSir);
		//韩琛的确认收货 触发了两个监视着的行为
		hanChen.notifys();

	}

}

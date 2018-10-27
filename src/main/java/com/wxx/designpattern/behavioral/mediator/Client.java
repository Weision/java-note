package com.wxx.designpattern.behavioral.mediator;

public class Client {

	public static void main(String[] args) {
		// 买家
		Buyer buyer = new Buyer();
		// 卖家
		Seller seller = new Seller();
		// 中介者
		AbstractMediator taoBao = new TaoBao(buyer, seller);
		System.out.println("剧情一----------买家发起购买-----------------");
		buyer.deal(taoBao, "购买", 20);

		System.out.println("剧情二----------买家发起退货-----------------");
		buyer.deal(taoBao, "退货", 20);

		System.out.println("剧情三----------卖家发起推销-----------------");
		seller.deal(taoBao, "购买", 30);

		System.out.println("剧情四----------卖家发起退货-----------------");
		seller.deal(taoBao, "退货", 30);
	}

}

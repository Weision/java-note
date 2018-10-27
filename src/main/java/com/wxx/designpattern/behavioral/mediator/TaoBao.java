package com.wxx.designpattern.behavioral.mediator;

public class TaoBao extends AbstractMediator {

	public TaoBao(AbstractCustomer buyer, AbstractCustomer seller) {
		super(buyer, seller);
	}

	@Override
	public void buyerAffectSeller(String doSomeThing, int money) {
		// 买家对卖家的关系
		seller.setMood(buyer.getMood());
		if ("购买".equals(doSomeThing)) {
			seller.account = seller.account + money;
			// 打印展示相互影响的结果
			System.out.println(buyer.name + "进行了[" + doSomeThing + "],花了[" + money + "元],心情很[" + buyer.mood
					+ "],当前账户余额[" + buyer.account + "元]");
			System.out.println(seller.getName() + "收到[" + doSomeThing + "]请求,收到[" + money + "元],心情很[" + seller.mood
					+ "],当前账户余额[" + seller.getAccount() + "元]");
		}
		if ("退货".equals(doSomeThing)) {
			seller.account = seller.account - money;
			// 打印展示相互影响的结果
			System.out.println(buyer.name + "进行了[" + doSomeThing + "],退了[" + money + "元],心情很[" + buyer.mood
					+ "],当前账户余额[" + buyer.account + "元]");
			System.out.println(seller.getName() + "收到[" + doSomeThing + "]请求,收到[" + money + "元],心情很[" + seller.mood
					+ "],当前账户余额[" + seller.getAccount() + "元]");
		}

	}

	@Override
	public void sellerAffectBuyer(String doSomeThing, int money) {
		// 卖家对买家的关系
		buyer.setMood(seller.getMood());
		if ("购买".equals(doSomeThing)) {
			buyer.account = buyer.account - money;
			// 打印展示相互影响的结果
			System.out.println(
					seller.name + "推销成功,收到[" + money + "元],心情很[" + seller.mood + "],当前账户余额[" + seller.account + "元]");
			System.out.println(buyer.getName() + "进行了[" + doSomeThing + "],花了[" + money + "元],心情很[" + seller.mood
					+ "],当前账户余额[" + buyer.getAccount() + "元]");
		}
		if ("退货".equals(doSomeThing)) {
			buyer.account = buyer.account + money;
			// 打印展示相互影响的结果
			System.out.println(seller.name + "收到[" + doSomeThing + "]请求,退了[" + money + "元],心情很[" + seller.mood
					+ "],当前账户余额[" + seller.account + "元]");
			System.out.println(buyer.getName() + "进行了[" + doSomeThing + "],收到[" + money + "元],心情很[" + buyer.mood
					+ "],当前账户余额[" + buyer.getAccount() + "元]");
		}
	}

}

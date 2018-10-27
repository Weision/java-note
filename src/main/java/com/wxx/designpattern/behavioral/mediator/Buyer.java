package com.wxx.designpattern.behavioral.mediator;

public class Buyer extends AbstractCustomer {
	public Buyer() {
		name = "淘宝买家";
	}

	@Override
	public synchronized  void  deal(AbstractMediator taoBao, String doSomeThing, int money) {
		if ("购买".equals(doSomeThing)) {
			// 事件只对对象本身造成影响
			mood = "good";
			account = account - money;
			// 通过中介者影响对方
			taoBao.buyerAffectSeller(doSomeThing, money);


		}

		if ("退货".equals(doSomeThing)) {
			// 事件只对对象本身造成影响
			mood = "bad";
			account = account + money;
			// 通过中介者影响对方
			taoBao.buyerAffectSeller(doSomeThing, money);
			
		}
	}

}

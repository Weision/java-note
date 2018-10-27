package com.wxx.designpattern.behavioral.mediator;

public abstract class AbstractMediator {
	protected AbstractCustomer buyer;
	protected AbstractCustomer seller;

	public AbstractMediator(AbstractCustomer buyer, AbstractCustomer seller) {
		this.buyer = buyer;
		this.seller = seller;
	}

	public abstract void buyerAffectSeller(String doSomeThing, int money);

	public abstract void sellerAffectBuyer(String doSomeThing, int money);
}

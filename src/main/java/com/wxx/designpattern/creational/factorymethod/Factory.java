package com.wxx.designpattern.creational.factorymethod;

public abstract class Factory {

	public final MobilePhone create(String s) {

		MobilePhone product = createProduct(s);
		return product;
	}

	public abstract MobilePhone createProduct(String s);

}

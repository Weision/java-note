package com.wxx.designpattern.behavioral.state;

public class IceState extends AbstractWaterState {

	@Override
	public void makeDrink(IceBox cookroom) {
		cookroom.setState(this);
		System.out.println("糕点师决定用冰做一份老酸奶炒冰片～");
	}
}

package com.wxx.designpattern.behavioral.state;

public class FrostState extends AbstractWaterState {

	@Override
	public void makeDrink(IceBox cookroom) {
		cookroom.setState(this);
		System.out.println("糕点师决定用霜做一杯水果补丁雪糕～");
	}
}

package com.wxx.designpattern.behavioral.state;

public class WaterState extends AbstractWaterState {

	@Override
	public void makeDrink(IceBox cookroom) {
		cookroom.setState(this);
		System.out.println("糕点师决定用水做一杯芒果果汁～");
	}
}

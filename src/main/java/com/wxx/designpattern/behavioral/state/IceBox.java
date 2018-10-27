package com.wxx.designpattern.behavioral.state;

public class IceBox {
	private AbstractWaterState state;

	public AbstractWaterState getState() {
		return state;
	}

	public void setState(AbstractWaterState state) {
		this.state = state;
	}

}

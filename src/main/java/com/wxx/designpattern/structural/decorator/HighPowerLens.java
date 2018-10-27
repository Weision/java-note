package com.wxx.designpattern.structural.decorator;

public abstract class HighPowerLens implements Weapon {
	// 将98k聚合进来
	protected Mauser98k m98k;

	public HighPowerLens(Mauser98k m98k) {
		this.m98k = m98k;
	}
}

package com.wxx.designpattern.behavioral.state;

public class Client {
	public static void main(String[] args) {
		// 上下文角色 冰箱
		IceBox iceBox = new IceBox();
		System.out.println("状态变化:当前冰箱温度为5度，水成液态状态～");
		// 水状态为液体
		WaterState water = new WaterState();
		water.makeDrink(iceBox);

		System.out.println("状态变化:当前冰箱温度为-2度，水变成霜～");
		// 水状态为霜
		FrostState snow = new FrostState();
		snow.makeDrink(iceBox);

		System.out.println("状态变化:当前冰箱温度为-15度，水变成了冰冻状态～");
		// 水状态为冰冻
		IceState ice = new IceState();
		ice.makeDrink(iceBox);

	}
}

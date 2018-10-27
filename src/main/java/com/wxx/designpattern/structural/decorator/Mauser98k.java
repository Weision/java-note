package com.wxx.designpattern.structural.decorator;

public class Mauser98k implements Weapon {

	public Mauser98k() {
		System.out.println("毛瑟 98k步枪射击精度高，经加装4倍、6倍光学瞄准镜后，可作为一种优秀的狙击步枪使用~");
	}

	@Override
	public void use(int precision) {

		if (precision >= 6) {
			System.out.println("让子弹飞一会，敌人倒下后，传来98k低沉的回声~");
		}
		if (precision < 4) {
			System.out.println("距离有点远 打偏了~");
		}

	}

}

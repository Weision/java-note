package com.wxx.designpattern.structural.decorator;

public class EightTimesScope extends HighPowerLens {
	// 八倍镜的精度是8
	private final int precision = 8;

	// 调用父类构造器
	public EightTimesScope(Mauser98k m98k) {
		super(m98k);
	}

	@Override
	public void use(int precision) {
		// 调用瞄准功能
		this.aim();
		// 加装8倍镜后 增强了98k精确度
		// 使用98k进行射击
		m98k.use(this.precision);

	}

	// 瞄准方法
	private void aim() {
		System.out.println("把十字准星对准了对方的沟子~");
	}

}

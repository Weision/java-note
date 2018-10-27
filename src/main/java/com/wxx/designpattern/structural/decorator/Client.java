package com.wxx.designpattern.structural.decorator;

public class Client {

	public static void main(String[] args) {
		// 使用没有装8倍镜的98k打一枪
		Mauser98k m98k = new Mauser98k();
		System.out.println("剧情:距离太远不好瞄准--------");
		// 距离有点远可能会打偏
		// 没有安装倍镜 所以倍镜精度传入0
		m98k.use(0);

		System.out.println("剧情:舔包捡到一个8倍镜--------");
		// 使用装了8倍镜的98k打一枪
		EightTimesScope ets = new EightTimesScope(m98k);
		// 通过8倍镜的精确瞄准
		ets.use(8);
	}

}

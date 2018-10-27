package com.wxx.designpattern.behavioral.command;

public class Client {
	public static void main(String[] args) {
		System.out.println("--秦武王于洛阳举鼎而死，秦昭襄王继位。");
		QinZhaoXiang zhaoXiangKing = new QinZhaoXiang();
		// 战神白起出现
		BaiQi baiQi = new BaiQi();
		// 不用命令模式的做法
		baiQi.fight();

		// 白起受到秦昭襄王重用
		System.out.println("------------打仗的命令---------------");
		Command huFu = new HuFu(baiQi);
		zhaoXiangKing.setHufu(huFu);

		zhaoXiangKing.makeDecision();
		zhaoXiangKing.makeDecision();
		zhaoXiangKing.makeDecision();

		// 秦昭襄王迁怒于白起
		System.out.println("------------命白起自刎的命令---------------");
		Idioctonia idioctonia = new Idioctonia(baiQi);
		zhaoXiangKing.setHufu(idioctonia);

		zhaoXiangKing.makeDecision();

	}
}

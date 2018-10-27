package com.wxx.designpattern.behavioral.visitor;

public class ChineseCommunistForces extends Visitor {

	@Override
	public void intervene(NorthKorea northKorea) {
		System.out.println("--------访问者---------中国人民志愿军跨过鸭绿江-->北朝鲜------------");
		System.out.println("抗美援朝，保家卫国~");
		northKorea.uniteNation();
		System.out.println("发动五次战役，血战上甘岭~");

	}

	@Override
	public void intervene(SouthKorea southKorea) {
		// 嘲讽技能
		System.out.println("--------访问者---------中国人民志愿军跨过鸭绿江-->南朝鲜------------");
		System.out.println("志愿军嘲讽技能：你们是帝国主义走狗~");
	}
}

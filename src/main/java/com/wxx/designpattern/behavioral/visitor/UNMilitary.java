package com.wxx.designpattern.behavioral.visitor;

public class UNMilitary extends Visitor {

	@Override
	public void intervene(NorthKorea northKorea) {
		// 嘲讽技能
		System.out.println("--------访问者---------美军第十军团仁川江登陆-->北朝鲜--------------");
		System.out.println("联合国军嘲讽技能：圣诞节我们就回家了~");
	}

	@Override
	public void intervene(SouthKorea southKorea) {
		System.out.println("--------访问者---------美军第十军团仁川江登陆-->南朝鲜------------");
		System.out.println("麦克阿瑟率领美军，在美英两国三百多艘军舰和五百多架飞机掩护下，成功登陆仁川~");
		southKorea.uniteNation();
		System.out.println("从朝鲜军队后方突袭，切断朝鲜半岛的蜂腰部一线，迅速夺回了仁川港和附近岛屿~");
	}
}

package com.wxx.designpattern.creational.builder;

//director导演角色 君主类 
public class King {
	//诸侯授权变法者执行变法
	public Country authorizeConstruct(Builder b) {
		b.buildPolotics();
		b.buildArmy();
		b.buildAgriculture();
		return b.getCountry();
	}
}

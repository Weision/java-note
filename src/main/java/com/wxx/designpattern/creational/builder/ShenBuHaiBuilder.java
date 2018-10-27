package com.wxx.designpattern.creational.builder;

public class ShenBuHaiBuilder extends Builder {
	//为韩国进行改革
	private Country han = new Country();;

	@Override
	public void buildPolotics() {
		han.setPolotics("整顿吏治，加强君主集权统治");
		han.setCountryname("韩");
	}

	@Override
	public void buildArmy() {
		han.setArmy("整肃军兵，严酷训练");

	}

	@Override
	public void buildAgriculture() {
		han.setAgriculture("多开荒地，多种粮食");
		han.setBuildResult("政局得到稳定，贵族受到限制，百姓渐趋富裕!");

	}

	@Override
	public Country getCountry() {
		return han;
	}

}

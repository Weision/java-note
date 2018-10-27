package com.wxx.designpattern.creational.builder;

public class ShangYangBuilder extends Builder {
	//为秦国进行改革
	private Country qin = new Country();

	@Override
	public void buildPolotics() {
		qin.setPolotics("中央集权，推行县制");
		qin.setCountryname("秦");

	}

	@Override
	public void buildArmy() {
		qin.setArmy("励军功，实行二十等爵制");

	}

	@Override
	public void buildAgriculture() {
		qin.setAgriculture("废井田，开阡陌");
		qin.setBuildResult("日渐强盛，收复失地，终一统天下!");

	}

	@Override
	public Country getCountry() {
		return qin;
	}

}

package com.wxx.designpattern.creational.builder;

public abstract class Builder {
	//政治改革
	public abstract void buildPolotics();
	//军事改革
	public abstract void buildArmy();
	//农业改革
	public abstract void buildAgriculture();
	//改革成果
	public abstract Country getCountry();
}

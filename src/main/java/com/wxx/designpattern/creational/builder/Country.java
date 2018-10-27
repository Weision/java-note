package com.wxx.designpattern.creational.builder;

public class Country {
	//国家的名字
	private String countryname;
	//国家的政治
	private String polotics;
	//国家的军事
	private String army;
	//国家的农业
	private String agriculture;
	//国家的新面貌
	private String buildResult;

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getPolotics() {
		return polotics;
	}

	public void setPolotics(String polotics) {
		this.polotics = polotics;
	}

	public String getArmy() {
		return army;
	}

	public void setArmy(String army) {
		this.army = army;
	}

	public String getAgriculture() {
		return agriculture;
	}

	public void setAgriculture(String agriculture) {
		this.agriculture = agriculture;
	}

	public String getBuildResult() {
		return buildResult;
	}

	public void setBuildResult(String buildResult) {
		this.buildResult = buildResult;
	}

	public void showPower() {
		System.out.println("国家:" + countryname);
		System.out.println("政治:" + polotics);
		System.out.println("军事:" + army);
		System.out.println("农业:" + agriculture);
		System.out.println("结果:" + buildResult);
		System.out.println("-----------------------");
	}

}

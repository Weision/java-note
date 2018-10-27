package com.wxx.designpattern.creational.prototype;

import java.io.Serializable;

public class NationalSituation implements Serializable{
	private static final long serialVersionUID = 1864667007956857078L;
	// 人口
	private String NationalPopulation;
	// 国土面积
	private String NationalArea;
	// 技术水平
	private String TechnicalLevel;

	public String getNationalPopulation() {
		return NationalPopulation;
	}

	public void setNationalPopulation(String nationalPopulation) {
		NationalPopulation = nationalPopulation;
	}

	public String getNationalArea() {
		return NationalArea;
	}

	public void setNationalArea(String nationalArea) {
		NationalArea = nationalArea;
	}

	public String getTechnicalLevel() {
		return TechnicalLevel;
	}

	public void setTechnicalLevel(String technicalLevel) {
		TechnicalLevel = technicalLevel;
	}

}

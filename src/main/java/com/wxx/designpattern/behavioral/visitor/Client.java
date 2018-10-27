package com.wxx.designpattern.behavioral.visitor;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		ChineseCommunistForces ccf = new ChineseCommunistForces();
		UNMilitary unm = new UNMilitary();
		List<Country> countryList = Korea.getList();
		System.out.println("-------------------------朝鲜战争爆发-----------------------");
		for (Country country : countryList) {
			country.fightWith(unm);
			country.fightWith(ccf);
		}

	}
}

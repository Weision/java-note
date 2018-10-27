package com.wxx.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Consumer zhangft = new Consumer("张奉天", 1, 5, 138);
		Consumer ruiBo = new Consumer("芮博", 5, 2, 238);
		Consumer zhongJj = new Consumer("仲军军", 10, 4, 1);

		List<Consumer> cs = new ArrayList<Consumer>();
		cs.add(zhangft);
		cs.add(ruiBo);
		cs.add(zhongJj);

		Filter broadbandFilter = new BroadbandFilter();
		Filter freeFlowFilter = new FreeFlowFilter();
		Filter birthdayRemindFilter = new BirthdayRemindFilter();

		System.out.println("移动宽带免费一年用户:");
		List<Consumer> broadband = broadbandFilter.filtrate(cs);
		printList(broadband, "移动宽带");
		System.out.println("免费赠送移动流量用户:");
		List<Consumer> freeFlow = freeFlowFilter.filtrate(cs);
		printList(freeFlow, "流量10G");
		System.out.println("赠送生日提醒用户:");
		List<Consumer> birthdayRemind = birthdayRemindFilter.filtrate(cs);
		printList(birthdayRemind, "生日提醒功能");

	}
	private static void printList(List<Consumer> cs, String bussiness) {
		for (Consumer c : cs) {
			System.out.println("[" + c.getStar() + "]星级用户[" + c.getName()
					+ "],在网[" + c.getExistsYears() + "],当前套餐为[" + c.getCombos()
					+ "],免费赠送[" + bussiness + "]");
		}
	}

}

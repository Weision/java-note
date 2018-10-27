package com.wxx.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class BirthdayRemindFilter implements Filter {

	@Override
	public List<Consumer> filtrate(List<Consumer> consumers) {
		List<Consumer> cs = new ArrayList<Consumer>();
		// 星级为5星级以上 赠送生日提醒
		for (Consumer c : consumers) {
			if (c.getCombos() >= 138) {
				cs.add(c);
			}
		}
		return cs;
	}

}

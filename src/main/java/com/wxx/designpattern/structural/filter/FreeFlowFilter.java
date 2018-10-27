package com.wxx.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FreeFlowFilter implements Filter {

	@Override
	public List<Consumer> filtrate(List<Consumer> consumers) {
		List<Consumer> cs = new ArrayList<Consumer>();
		// 在网年份大于5年 赠送10G移动流量
		for (Consumer c : consumers) {
			if (c.getExistsYears() >= 5) {
				cs.add(c);
			}
		}
		return cs;
	}

}

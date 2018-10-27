package com.wxx.designpattern.structural.proxy;

import java.util.Random;

public class CiXi implements Emperor {
	private Emperor hd = new GuangXu();
	public CiXi() {
		System.out.println("慈溪太后垂帘听政");
	}
	@Override
	public void dealThings(String thing) {
		look(thing);
		decide(thing);
		hd.dealThings(thing);
	}

	private void look(String thing) {
		System.out.println("慈禧太后过目了一下关于[" + thing + "]的奏折");
	}

	private void decide(String thing) {
		Random r = new Random();
		int i = r.nextInt(10);
		//根据心情来进行决策
		if (i % 2 == 0) {
			System.out.println("然后否决了关于[" + thing + "]的奏折");
		} else {
			System.out.println("然后同意了关于[" + thing + "]的奏折");
		}

	}

}

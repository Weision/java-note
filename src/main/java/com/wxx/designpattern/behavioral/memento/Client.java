package com.wxx.designpattern.behavioral.memento;

public class Client {
	public static void main(String[] args) {
		// 大汉帝国
		Han han = new Han();
		// 汉武帝建元年间 司马到长安任太史令
		System.out.println("汉武帝建元年间,司马到长安任太史令。");
		SiMaQian sm = new SiMaQian();
		// 公元前108年
		han.setThing("天下大旱。");
		History h = new History(han.getThing());
		sm.addHistoryList("公元前108年", h);
		// 公元前104年
		han.setThing("汉朝历法改革，制定<<汉历>>。");
		History h1 = new History(han.getThing());
		sm.addHistoryList("公元前104年", h1);
		// 公元前99年
		han.setThing("李陵率步兵五千涉单于庭以寡击众，粮尽矢绝后，被迫投降。");
		History h2 = new History(han.getThing());
		sm.addHistoryList("公元前99年", h2);

		System.out.println("公元前108年:" + sm.getHistoryList("公元前108年").getThing());
		System.out.println("公元前104年:" + sm.getHistoryList("公元前104年").getThing());
		System.out.println("公元前99年:" + sm.getHistoryList("公元前99年").getThing());
		// 历史不可倒退 故无法回到过去
	}
}

package com.wxx.designpattern.behavioral.observer;

public class HanChen extends AbstractRingleader {

	@Override
	public void notifys() {
		System.out.println("--------镜头一-------");
		System.out.println("韩琛和泰国佬寒暄之后，让陈永仁验了货后，就打电话给在码头的傻强收货～");
		for (AbstractObserver observer : observers) {
			observer.sendIntelligence();
		}
	}

}

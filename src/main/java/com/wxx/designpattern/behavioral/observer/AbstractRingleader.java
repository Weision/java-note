package com.wxx.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRingleader {
	protected List<AbstractObserver> observers = new ArrayList<AbstractObserver>();
	//情报人员暗中监视
	public void addobservers(AbstractObserver Observer) {
		observers.add(Observer);
	}
	//情报人员不再监视
	public void deleteobservers(AbstractObserver Observer) {
		observers.remove(Observer);
	}
	// 目标人物的行动
	public abstract void notifys();

}

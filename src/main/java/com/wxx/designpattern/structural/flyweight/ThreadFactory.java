package com.wxx.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ThreadFactory {
	private static ThreadFactory threadFactory = new ThreadFactory();
	private Map<String, AbstractThread> threadMap = new HashMap<String, AbstractThread>();

	private ThreadFactory() {
		AbstractThread threadA = new ThreadA("A");
		AbstractThread threadB = new ThreadB("B");
		threadMap.put("A", threadA);
		threadMap.put("B", threadB);

	}

	public static ThreadFactory getThreadFactory() {
		return threadFactory;
	}

	public AbstractThread getThread(String threadName) {
		// 如果想要获取的线程享元池中存在 则从享元池中获取
		if (threadMap.containsKey(threadName)) {
			return threadMap.get(threadName);
		}
		// 如果想要获取的线程享元池中不存在 则new一个
		else {
			ThreadNew threadNew = new ThreadNew(threadName);
			threadMap.put(threadName, threadNew);
			return threadNew;
		}

	}
}

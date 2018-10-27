package com.wxx.designpattern.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

public class SiMaQian {
	private Map<String, History> historyMap = new HashMap<String, History>();

	public void addHistoryList(String year, History history) {
		historyMap.put(year, history);
	}

	public History getHistoryList(String year) {
		if (historyMap.containsKey(year)) {
			return historyMap.get(year);
		}
		return null;
	}
}

package com.wxx.designpattern.structural.filter;

import java.util.List;

public interface Filter {
	public List<Consumer> filtrate(List<Consumer> consumers);
}

package com.wxx.designpattern.behavioral.nullobject;

public class PhoneFactoryWithoutNull {
	public static final String[] phones = {"小米", "锤子", "华为"};

	public static AbstractPhone getPhone(String name) {
		for (String phoneName : phones) {
			if (phoneName.equals(name)) {
				return new ExistingPhone(name);
			}
		}
		// 不使用空对象思想 一般在找不到的时候 返回一个null
		return null;
	}
}

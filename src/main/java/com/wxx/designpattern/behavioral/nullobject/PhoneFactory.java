package com.wxx.designpattern.behavioral.nullobject;

public class PhoneFactory {
	public static final String[] phones = {"小米", "锤子", "苹果"};

	public static AbstractPhone getPhone(String name) {
		for (String phoneName : phones) {
			if (phoneName.equals(name)) {
				return new ExistingPhone(name);
			}
		}
		// 空对象设计模式 关键之处
		return new NonexistentPhone();
	}
}

package com.wxx.designpattern.behavioral.nullobject;

public class ExistingPhone extends AbstractPhone {
	public ExistingPhone(String phoneName) {
		this.phoneName = phoneName;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getPhoneName() {
		return phoneName;
	}
}

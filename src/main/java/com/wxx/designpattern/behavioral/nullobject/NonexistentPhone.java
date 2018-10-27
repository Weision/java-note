package com.wxx.designpattern.behavioral.nullobject;

public class NonexistentPhone extends AbstractPhone {
	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getPhoneName() {

		return "后续会增加该厂商手机产线，生产其品牌手机～";
	}
}

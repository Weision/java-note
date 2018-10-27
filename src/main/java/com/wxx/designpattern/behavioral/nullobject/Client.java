package com.wxx.designpattern.behavioral.nullobject;

public class Client {
	public static void main(String[] args) {
		// 因为没有这个品牌手机的存在，所以订购的对象是ExistingPhone对象，而不是null
		AbstractPhone apple = PhoneFactory.getPhone("苹果");
		AbstractPhone xiaoMi = PhoneFactory.getPhone("小米");
		AbstractPhone chuiZi = PhoneFactory.getPhone("锤子");
		AbstractPhone huaWei = PhoneFactory.getPhone("华为");
		System.out.println("--------------返回空对象--------------");
		System.out.println("可以从富士康订购的手机:");
		System.out.println(xiaoMi.getPhoneName());
		System.out.println(chuiZi.getPhoneName());
		System.out.println(huaWei.getPhoneName());
		System.out.println(apple.getPhoneName());
		
		System.out.println("--------------返回null---------------");
		// 因为没有这个品牌手机的存在，所以订购的对象是ExistingPhone对象，而不是null
		AbstractPhone nokia = PhoneFactoryWithoutNull.getPhone("诺基亚");
		System.out.println("可以从富士康订购的手机:");
		System.out.println(nokia.getPhoneName());

	}
}

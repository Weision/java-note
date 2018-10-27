package com.wxx.designpattern.structural.bridge;

public class XiaoMi implements MobilePhone {
	private final String name = "小米Mix2";

	public XiaoMi() {
		System.out.println("200人设计团队~");
		System.out.println("500张设计草图~");
		System.out.println("1000小时头脑风暴~");
		System.out.println("20000次跌落试验~");
		System.out.println("小米手机:一面科技，一面艺术~");
		System.out.println("----------------[" + name + "]研发结束-----------------");
	}

	public String getName() {
		return name;
	}
}

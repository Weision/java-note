package com.wxx.designpattern.behavioral.chainofresponsibility;

public class RamWorker extends AssemblyWorker {

	private final String name = "运行内存组装工人";

	public RamWorker(MobilePhone mobilePhone) {
		super(mobilePhone);
	}

	@Override
	public void assembling() {
		if (null == mobilePhone.getRam()) {
			mobilePhone.setRam("DDR4 8G 运行内存");
			System.out.println(name + "运行内存给手机组装上了");
		}
		// 如果已经设定下一个处理着 就调用下个责任人处理
		if (null != nextWorker) {
			nextWorker.assembling();
		}

	}

}

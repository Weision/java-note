package com.wxx.designpattern.behavioral.chainofresponsibility;

public class CpuWorker extends AssemblyWorker {

	private final String name = "CPU组装工人";

	public CpuWorker(MobilePhone mobilePhone) {
		super(mobilePhone);
	}

	@Override
	public void assembling() {
		if (null == mobilePhone.getCpu()) {
			mobilePhone.setCpu("高通骁龙8");
			System.out.println(name + "将CPU给手机组装上了");
		}
		// 如果已经设定下一个处理着 就调用下个责任人处理
		if (null != nextWorker) {
			nextWorker.assembling();
		}

	}

}

package com.wxx.designpattern.behavioral.chainofresponsibility;

public class CameraWorker extends AssemblyWorker {

	private final String name = "摄像头组装工人";

	public CameraWorker(MobilePhone mobilePhone) {
		super(mobilePhone);
	}

	@Override
	public void assembling() {
		if (null == mobilePhone.getCamera()) {
			mobilePhone.setCamera("索尼2400万像素摄像头");
			System.out.println(name + "将摄像头给手机组装上了");
		}
		// 如果已经设定下一个处理着 就调用下个责任人处理
		if (null != nextWorker) {
			nextWorker.assembling();
		}

	}

}

package com.wxx.designpattern.behavioral.chainofresponsibility;

public abstract class AssemblyWorker {
	// 责任链关键 下一个工人
	protected AssemblyWorker nextWorker;
	protected MobilePhone mobilePhone;

	public AssemblyWorker(MobilePhone mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public abstract void assembling();

	// 设定下一个工人
	public void setNextWorker(AssemblyWorker nextWorker) {
		this.nextWorker = nextWorker;
	}

}

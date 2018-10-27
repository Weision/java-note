package com.wxx.designpattern.behavioral.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		// 对一个什么都没有的手机进行组装
		MobilePhone mp = new MobilePhone();
		AssemblyWorker cpuWorker = new CpuWorker(mp);
		AssemblyWorker cameraWorker = new CameraWorker(mp);
		AssemblyWorker ramWorker = new RamWorker(mp);
		cpuWorker.setNextWorker(cameraWorker);
		cameraWorker.setNextWorker(ramWorker);

		cpuWorker.assembling();
		mp.show();
		System.out.println("-------------------------");

		// 对一个已经存在CPU的手机进行组装
		MobilePhone mp1 = new MobilePhone();
		mp1.setCpu("Intel");
		AssemblyWorker cpuWorker1 = new CpuWorker(mp1);
		AssemblyWorker cameraWorker1 = new CameraWorker(mp1);
		AssemblyWorker ramWorker1 = new RamWorker(mp1);
		cpuWorker1.setNextWorker(cameraWorker1);
		cameraWorker1.setNextWorker(ramWorker1);

		cpuWorker1.assembling();
		mp1.show();
	}
}

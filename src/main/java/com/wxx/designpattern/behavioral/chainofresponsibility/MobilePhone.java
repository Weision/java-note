package com.wxx.designpattern.behavioral.chainofresponsibility;

public class MobilePhone {
	private String cpu;
	private String camera;
	private String ram;

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public void show() {
		System.out.println("该手机的CPU为[" + cpu + "],Camera为[" + camera + "],RAM为[" + ram + "]");
	}
}

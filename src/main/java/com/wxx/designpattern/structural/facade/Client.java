package com.wxx.designpattern.structural.facade;

public class Client {

	public static void main(String[] args) {
		// 咖啡师
		Barista Barista = new Barista();
		// 制作一杯咖啡
		Barista.makeCofe();
	}

}

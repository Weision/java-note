package com.wxx.designpattern.behavioral.template;

public class Client {
	public static void main(String[] args) {
		AbstractPlasterSculpture redPeiQi = new RedPeiQi();
		redPeiQi.show();
		System.out.println("------------------制作完毕-------------------");
		
		AbstractPlasterSculpture blackPeiQi = new BlackPeiQi();
		blackPeiQi.show();
		System.out.println("------------------制作完毕-------------------");
	}
}

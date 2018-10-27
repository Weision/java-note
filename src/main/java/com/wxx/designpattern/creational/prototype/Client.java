package com.wxx.designpattern.creational.prototype;

public class Client {

	public static void main(String[] args) {
		// 苏联
		Communism soviet = new Soviet("共产主义", "很大很大", "2亿", "牛逼");
		// 中国
		Communism china = soviet.deepClone();
		// 朝鲜
		Communism Korea = soviet.getClone();
		// 越南
		@SuppressWarnings("unused")
		Communism vietnam = soviet.getClone();
		
		System.out.println("-------------苏联--------------");
		String sovietBelief = soviet.getBelief();
		System.out.println("-------------中国--------------");
		String chinaBelief = china.getBelief();
		System.out.println("-------------朝鲜--------------");
		String koreaBelief = Korea.getBelief();
		System.out.println("-------------浅克隆--------------");
		// 查看是否指向一个地址
		if (soviet == Korea) {
			System.out.println("soviet == Korea");
		} else {
			System.out.println("soviet != Korea");
		}
		// 查看内部属性是否指向一个地址
		if (sovietBelief == koreaBelief) {
			System.out.println("sovietBelief == koreaBelief");
		} else {
			System.out.println("sovietBelief != koreaBelief");
		}

		// 查看内部属性是否指向一个地址
		if (soviet.getNationalSituation() == Korea.getNationalSituation()) {
			System.out.println("soviet.getNationalSituation == Korea.getNationalSituation");
		} else {
			System.out.println("soviet.getNationalSituation ！= Korea.getNationalSituation");
		}
		System.out.println("-------------深克隆--------------");
		System.out.println("-及时修正路线:农村包围城市,中国特色社会主义-");
		// 查看是否指向一个地址
		if (soviet == china) {
			System.out.println("soviet == china");
		} else {
			System.out.println("soviet != china");
		}
		// 查看内部属性是否指向一个地址
		if (sovietBelief == chinaBelief) {
			System.out.println("sovietBelief == chinaBelief");
		} else {
			System.out.println("sovietBelief != chinaBelief");
		}

		// 查看内部属性是否指向一个地址
		if (soviet.getNationalSituation() == china.getNationalSituation()) {
			System.out.println("soviet.getNationalSituation == china.getNationalSituation");
		} else {
			System.out.println("soviet.getNationalSituation ！= china.getNationalSituation");
		}

	}

}

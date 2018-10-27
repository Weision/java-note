package com.wxx.designpattern.structural.adapter;

public class Client {
	public static void main(String[] args) {
		
		// 周董的真爱范特西KTV
		System.out.println("-- 三个闺蜜来到真爱范特西KTV门口 --");
		FantasyKtv fk = new FantasyKtv();
		// 决定只唱歌
		System.out.println("-- 她们决定进去唱歌  --");
		fk.sing("只唱歌", "后来");
		System.out.println("-- 她失恋一年多了还是忘不了他,旁边的闺蜜也跟着泪流不止  --");
		
		
		
		System.out.println("-----------分割线------------");
		
		
		
		// 决定吃着火锅唱着歌
		System.out.println("-- 他们决定吃着火锅唱着歌  --");
		fk.sing("吃着火锅唱着歌", "九宫格");
		System.out.println("-----------分割线-------------");
		fk.sing("吃着火锅唱着歌", "麻辣");
	}
}

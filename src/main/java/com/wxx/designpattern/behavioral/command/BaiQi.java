package com.wxx.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class BaiQi {
	private List<String> deeds = new ArrayList<String>();
	private int index = 0;

	public BaiQi() {
		// 季君之乱
		deeds.add("--未使用命令模式--秦昭襄王立,白起助魏冉平季君之乱。");
		deeds.add("--接收者角色白起--秦昭襄王十四年,白起在崤函关以东灭韩魏联军二十四万人。");
		deeds.add("--接收者角色白起--秦昭襄王十五年，白起夺取魏大小六十一座城池。");
		deeds.add("--接收者角色白起--秦昭襄王二十八年，白起攻楚取五座城池。");
		deeds.add("--接收者角色白起--秦昭襄王二十九年，白起攻陷楚都城郢，楚王避难于陈。");
	}

	public void fight() {
		System.out.println(deeds.get(index));
		index++;
	}

	public void ziWen() {
		System.out.println("--接收者角色白起--秦昭襄王五十年，战神白起自刎于杜邮。");
	}
}

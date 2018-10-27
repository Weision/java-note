package com.wxx.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Korea {

	public static List<Country> getList() {
		List<Country> korea = new ArrayList<Country>();

		System.out.println("1948年5月10日 大韩民国成立");
		korea.add(new SouthKorea());
		System.out.println("1948年9月 朝鲜民主主义人民共和国成立");
		korea.add(new NorthKorea());

		System.out.println("在美、苏影响下 朝鲜半岛出现了南北阵营");
		return korea;
	}

}

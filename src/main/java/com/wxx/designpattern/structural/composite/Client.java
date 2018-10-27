package com.wxx.designpattern.structural.composite;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		System.out.println("剧情:天庭建立之前，诸神终日混战，三界大乱~");
		System.out.println("剧情:天庭建立，结束纷争~");
		YuDi yd = new YuDi();
		TaiBaiJinXing taiBai = new TaiBaiJinXing();
		TuoTaLiTianWang tuoTa = new TuoTaLiTianWang();
		ChangE ce = new ChangE();
		yd.addShen(taiBai);
		yd.addShen(tuoTa);
		yd.addShen(ce);
		System.out.println("剧情:等诸神纷纷被玉帝招进天庭...");
		System.out.println("-------------------");
		System.out.println("剧情:孙悟空在花果山自称\"齐天大圣\" 怎么办?");
		ShenXian tb = whoDeal(yd.getShenList(), "调解");
		tb.dealProblem();
		SunWuKong biMaWen = new SunWuKong();
		yd.addShen(biMaWen);
		biMaWen.dealProblem();
		System.out.println("剧情:孙悟空私自下凡，天庭决定动用武力...");
		ShenXian tt = whoDeal(yd.getShenList(), "打");
		tt.dealProblem();
		System.out.println("剧情:想知后事如何，且听下回分解...");

	}

	// 遍历枝干的list找到需要的那个叶子
	private static ShenXian whoDeal(List<ShenXian> shen, String how) {
		ShenXian sx = null;
		for (ShenXian s : shen) {
			if (how.equals(s.getDuty())) {
				sx = s;
			}

		}
		return sx;
	}
}

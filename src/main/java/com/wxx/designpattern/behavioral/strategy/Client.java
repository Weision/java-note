package com.wxx.designpattern.behavioral.strategy;

public class Client {
	public static void main(String[] args) {
		//剧情：刘备利用周瑜、曹仁厮杀，袭取了南郡、荆州、襄阳和长沙四郡；周瑜计上心来，孙权派人到荆州说亲。
		//剧情：刘备拒绝，诸葛亮笑道：您只管去东吴，我自有安排。
		//剧情：诸葛亮对赵云道：我这里有三个锦囊，内藏三条妙计。到南徐时打开第一个，到年底时打开第二个，危急无路时打开第三个。
		  
		//锦囊妙计之南徐
		SilkBag nanXuSb = new NanXuSilkBag();
		//锦囊妙计之年底
		SilkBag endYearSb = new EndYearSilkBag();
		//锦囊妙计之走投无路
		SilkBag CorneredSb = new CorneredSilkBag();
		Situation situation= null;
		
		situation = new Situation(nanXuSb,"赵云领了500士兵护卫刘备前去东吴，到了南徐。");
		situation.solveProblem();
		
		System.out.println("剧情：周瑜安排的假戏变成了真事，心里叫苦不迭，一计不成，又心生一计：利用声色犬马迷住刘备，离间他们上下之间的关系，我们再出兵攻取荆州");
		
		situation = new Situation(endYearSb,"刘备迷恋新婚的甜蜜生活，暂时不想回荆州。赵云劝告也无用，非常焦急，转眼到了年底。");
		situation.solveProblem();
		
		System.out.println("剧情：孙权得知刘备逃跑，大怒，先后派两起人马追赶。");
		situation = new Situation(CorneredSb,"躲过两起人马追赶，刘备一行人快到柴桑地界，周瑜派出的一支军队拦住去路。见形势危急。");
		situation.solveProblem();
	}
}

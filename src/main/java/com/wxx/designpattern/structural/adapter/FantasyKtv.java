package com.wxx.designpattern.structural.adapter;

public class FantasyKtv implements Ktv {
	private MeiTuanAdapter md = new MeiTuanAdapter();

	@Override
	public void sing(String how, String whitchOne) {
		if ("只唱歌".equals(how)) {
			System.out.println("她站起来，唱了一首[" + whitchOne + "]~");
			System.out.println("初听不知曲中意，再唱已是曲中人~");
		}
		if ("吃着火锅唱着歌".equals(how)) {
			// 打开了美团外卖
			md.sing(how, whitchOne);
		}
	}

}

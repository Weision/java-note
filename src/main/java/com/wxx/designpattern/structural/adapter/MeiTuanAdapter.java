package com.wxx.designpattern.structural.adapter;

public class MeiTuanAdapter implements Ktv {
	private HuoGuo huoGuo;

	@Override
	public void sing(String how, String whitchOne) {
		if ("吃着火锅唱着歌".equals(how)) {
			chiHuoGuo(whitchOne);
			huoGuo.eat(whitchOne);
			// 不想增加入参了 写死一首歌 ^_^
			System.out.println("站起来，唱了一首[辣妹子辣]~");
		}
	}

	private void chiHuoGuo(String whitchOne) {
		// 打开美团外卖
		if ("九宫格".equals(whitchOne)) {
			huoGuo = new XiaoJiu();
		} else {
			huoGuo = new HaiDiLao();
		}
	}

}

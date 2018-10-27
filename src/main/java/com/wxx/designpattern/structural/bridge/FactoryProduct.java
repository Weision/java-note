package com.wxx.designpattern.structural.bridge;

public class FactoryProduct extends AbstractBridgeProduct {

	public FactoryProduct(MobilePhone re) {
		// 调用父类构造器
		super(re);
	}

	@Override
	public void productMobile() {
		System.out.println("[" + re.getName() + "]经富士康5号流水线工人组装完成~");
		System.out.println("[" + re.getName() + "]经富士康5号流水线质检张全蛋检查完毕~");
		System.out.println("[" + re.getName() + "]手机生产完毕~");
		System.out.println("----------------[" + re.getName() + "]研发结束-----------------");
	}

}

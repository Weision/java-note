package com.wxx.designpattern.behavioral.template;

public abstract class AbstractPlasterSculpture {

	public final void show() {
		//生产模型雕塑
		productPlasterSculpture();
		//給模型上色
		coloring();
	}

	public void productPlasterSculpture()
	{  
		System.out.println("找些薄的铁皮来,沿着泥塑的高点把铁片插进去"); 
		System.out.println("把石膏粉或水一遍一遍的洒在泥塑上面"); 
		System.out.println("等干了以后，把在插片处一点一点把几半石膏模分开"); 
		System.out.println("在石膏模具里面加点钢筋，缠上麻丝"); 
		System.out.println("干了以后再用凿子把磨具敲碎,这样一个石膏雕塑出炉了"); 
	}

	public abstract void coloring();
}

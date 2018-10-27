package com.wxx.designpattern.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Soviet implements Communism ,Serializable{
	
	private static final long serialVersionUID = 5344691963719733036L;

	private NationalSituation ns = new NationalSituation();
	

	private String belief;

	public Soviet(String belief, String nationalArea, String nationalPopulation, String technicalLevel) {
		ns.setNationalArea(nationalArea);
		ns.setNationalPopulation(nationalPopulation);
		ns.setTechnicalLevel(technicalLevel);
		this.belief = belief;
	}

	@Override
	public Communism getClone() {
		Communism c = null;
		try {
			c = (Communism) super.clone();
		} catch (CloneNotSupportedException e) {
			 System.out.println("不支持复制！");
             return null;
		}
		return c;
	}

	@Override
	public String getBelief() {
		System.out.println("我是国土面积:[" + ns.getNationalArea() 
			+ "]"+ ",人口:[" + ns.getNationalPopulation() 
			+ "],我的信仰是:实现[" + belief+"]");
		return belief;
	}
	
	@Override
	public NationalSituation getNationalSituation() {
		return ns;
	}
	
	// 使用序列化技术实现深克隆
	public Communism deepClone() {
		// 将对象写入流中
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos;
		ByteArrayInputStream bis;

		try {
			oos = new ObjectOutputStream(bao);
			oos.writeObject(this);
			// 将对象从流中取出
			bis = new ByteArrayInputStream(bao.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			return (Communism) ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			return null;
		}

	}

}

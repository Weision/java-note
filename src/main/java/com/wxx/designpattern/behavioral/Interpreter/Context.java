package com.wxx.designpattern.behavioral.Interpreter;

/**
 * 全局性作用 存储一些全局性的数据
 */
public class Context {
	private String sql;

	public Context(String sql) {
		this.sql = sql;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

}

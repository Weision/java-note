package com.wxx.designpattern.behavioral.Interpreter;

public class Client {
	public static void main(String[] args) {
		// 要解析的sql
		String sql = "select * from students where name = 'weixx';";
		System.out.println("解析前---->" + sql);
		// 生成上下文
		Context ctx = new Context(sql);
		// 先开始特殊字符解释器
		AbstractExpression eExp = new EspecialExpression();
		eExp.interpret(ctx);
		System.out.println("解析后---->" + ctx.getSql());
	}
}

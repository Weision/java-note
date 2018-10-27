package com.wxx.designpattern.behavioral.Interpreter;

public abstract class AbstractExpression {
	// 入参为 全局性上下文
	public abstract void interpret(Context ctx);
}

package com.wxx.designpattern.behavioral.Interpreter;

/**
 * 终止解释器
 */
public class EndExpression extends AbstractExpression {

	@Override
	public void interpret(Context ctx) {
		String sql = ctx.getSql();
		sql = sql.replace(";", "");
		ctx.setSql(sql);
	}

}

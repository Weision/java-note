package com.wxx.designpattern.behavioral.Interpreter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 关键字解释器
 */
public class KeywordExpression extends AbstractExpression {
	private Map<String, String> map = new HashMap<String, String>();

	public KeywordExpression() {
		map.put("select", "查询");
		map.put("from", "从表");
		map.put("where", "中，条件是");
	}

	@Override
	public void interpret(Context ctx) {
		String sql = ctx.getSql();
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (sql.contains(next)) {
				sql = sql.replace(next, map.get(next));
			}
		}
		ctx.setSql(sql);
		AbstractExpression keExp = new EndExpression();
		keExp.interpret(ctx);
	}

}

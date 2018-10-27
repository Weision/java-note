package com.wxx.designpattern.behavioral.Interpreter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 特殊符号解释器
 */
public class EspecialExpression extends AbstractExpression {
	private Map<String, String> map = new HashMap<String, String>();

	public EspecialExpression() {
		map.put("*", "所有字段");
		map.put("=", "等于");
	}

	@Override
	public void interpret(Context ctx) {
		String sql = ctx.getSql();
		if (sql.contains("=")) {
			sql = sql.replaceAll("'", "");
		}
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (sql.contains(next)) {
				sql = sql.replace(next, map.get(next));
			}
		}
		ctx.setSql(sql);
		AbstractExpression keExp = new KeywordExpression();
		keExp.interpret(ctx);
	}

}

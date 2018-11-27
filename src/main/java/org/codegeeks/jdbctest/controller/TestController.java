package org.codegeeks.jdbctest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelEvaluationException;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Value("${test.value}")
	private String test;
	
	
	@RequestMapping("/test")
	public String queryDB() {
	
		ExpressionParser expression = new SpelExpressionParser();
		Integer in =new Integer(12);
		Expression expression2 = expression.parseExpression("14.toString()");
		String value =(String) expression2.getValue(in);
		return value;
	}
}

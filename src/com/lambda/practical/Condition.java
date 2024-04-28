package com.lambda.practical;

@FunctionalInterface
public interface Condition <T> {
	
	public boolean test(T t);

}

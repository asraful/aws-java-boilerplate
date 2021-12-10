package com.cloud.orc.core;

public interface TemplateExecutor {
	
	public <T> T execute(Class<T> t);

}

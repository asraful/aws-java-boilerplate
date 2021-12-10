package com.cloud.orc.core;

import org.springframework.beans.factory.annotation.Autowired;

public class CloudformationExecutor implements TemplateExecutor {

	@Autowired
	AWSConnector awsConnector;

	@Override
	public <T> T execute(Class<T> t) {
		return null;
	}

}

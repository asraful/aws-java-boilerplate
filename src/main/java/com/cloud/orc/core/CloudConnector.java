package com.cloud.orc.core;

import org.springframework.stereotype.Component;

@Component
public interface CloudConnector {
	
	public <T> T connect();

}

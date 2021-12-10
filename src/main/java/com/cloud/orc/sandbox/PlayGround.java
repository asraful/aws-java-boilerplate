package com.cloud.orc.sandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.cloud.orc.core.AWSConnector;
import com.cloud.orc.core.model.AWSConnectorProperties;
import com.cloud.orc.core.model.ConnectionProperty;

@Service
public class PlayGround {

	@Autowired
	private AWSConnector awsConnector;
	
	
	@Autowired
	AWSConnectorProperties connectionProperty;
	
	@EventListener(ApplicationReadyEvent.class)
	public void play() {
		
		System.out.println(connectionProperty.getAccessKey());
//		awsConnector.getS3Cinet();
	}

}

package com.cloud.orc.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.cloud.orc.core.model.AWSConnectorProperties;

@Component
public class AWSConnector implements CloudConnector {

	@Autowired
	AWSConnectorProperties awsConnectorProperties;

	@SuppressWarnings("unchecked")
	@Override
	public <T> T connect() {
		return (T) new BasicAWSCredentials(awsConnectorProperties.getAccessKey(),
				awsConnectorProperties.getSecretKey());
	}

	public AmazonS3 getS3Cinet() {
		AWSCredentials credentials = new BasicAWSCredentials(awsConnectorProperties.getAccessKey(),
				awsConnectorProperties.getSecretKey());
		return AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials))
				.withRegion(Regions.US_EAST_2).build();
	}
}

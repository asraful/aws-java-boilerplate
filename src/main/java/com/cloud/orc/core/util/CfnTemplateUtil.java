package com.cloud.orc.core.util;

import software.amazon.awssdk.services.cloudformation.CloudFormationClient;
import software.amazon.awssdk.services.cloudformation.model.CloudFormationException;
import software.amazon.awssdk.services.cloudformation.model.GetTemplateRequest;
import software.amazon.awssdk.services.cloudformation.model.GetTemplateResponse;

public class CfnTemplateUtil {

    public static void getSpecificTemplate(CloudFormationClient cfClient, String stackName) {

        try {
            GetTemplateRequest typeRequest = GetTemplateRequest.builder()
                    .stackName(stackName)
                    .build();

            GetTemplateResponse response = cfClient.getTemplate(typeRequest);
            String body = response.templateBody();
            System.out.println(body);

        } catch (CloudFormationException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

}

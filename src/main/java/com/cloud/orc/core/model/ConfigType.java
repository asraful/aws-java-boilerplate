package com.cloud.orc.core.model;

public enum ConfigType {
    AWS_CFN, AWS_CONNECTION;
    private String configType;

    public String getConfigType() {
        return configType;
    }
}

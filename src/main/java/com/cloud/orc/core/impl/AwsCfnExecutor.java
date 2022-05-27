package com.cloud.orc.core.impl;

import com.cloud.orc.core.api.TemplateExecutor;
import com.cloud.orc.core.model.CfnTemplate;

public class AwsCfnExecutor implements TemplateExecutor<CfnTemplate> {
    @Override
    public CfnTemplate execute(CfnTemplate t) {
        return new CfnTemplate();
    }
}

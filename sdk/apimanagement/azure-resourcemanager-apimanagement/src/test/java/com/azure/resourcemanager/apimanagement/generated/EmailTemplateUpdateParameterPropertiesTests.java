// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.EmailTemplateUpdateParameterProperties;
import com.azure.resourcemanager.apimanagement.models.EmailTemplateParametersContractProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EmailTemplateUpdateParameterPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EmailTemplateUpdateParameterProperties model =
            BinaryData
                .fromString(
                    "{\"subject\":\"hjqwmchqoh\",\"title\":\"xcpup\",\"description\":\"i\",\"body\":\"j\",\"parameters\":[{\"name\":\"lvw\",\"title\":\"wsmosao\",\"description\":\"qnamppultassa\"},{\"name\":\"ewnazeajbkajlcyi\",\"title\":\"ddcvxodk\",\"description\":\"fsxxby\"},{\"name\":\"sqlv\",\"title\":\"cpwgoljtzxnmxsd\",\"description\":\"ygoogxqapjxva\"},{\"name\":\"jfucsaodjnosdkv\",\"title\":\"fasgm\",\"description\":\"rnzpducdaak\"}]}")
                .toObject(EmailTemplateUpdateParameterProperties.class);
        Assertions.assertEquals("hjqwmchqoh", model.subject());
        Assertions.assertEquals("xcpup", model.title());
        Assertions.assertEquals("i", model.description());
        Assertions.assertEquals("j", model.body());
        Assertions.assertEquals("lvw", model.parameters().get(0).name());
        Assertions.assertEquals("wsmosao", model.parameters().get(0).title());
        Assertions.assertEquals("qnamppultassa", model.parameters().get(0).description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EmailTemplateUpdateParameterProperties model =
            new EmailTemplateUpdateParameterProperties()
                .withSubject("hjqwmchqoh")
                .withTitle("xcpup")
                .withDescription("i")
                .withBody("j")
                .withParameters(
                    Arrays
                        .asList(
                            new EmailTemplateParametersContractProperties()
                                .withName("lvw")
                                .withTitle("wsmosao")
                                .withDescription("qnamppultassa"),
                            new EmailTemplateParametersContractProperties()
                                .withName("ewnazeajbkajlcyi")
                                .withTitle("ddcvxodk")
                                .withDescription("fsxxby"),
                            new EmailTemplateParametersContractProperties()
                                .withName("sqlv")
                                .withTitle("cpwgoljtzxnmxsd")
                                .withDescription("ygoogxqapjxva"),
                            new EmailTemplateParametersContractProperties()
                                .withName("jfucsaodjnosdkv")
                                .withTitle("fasgm")
                                .withDescription("rnzpducdaak")));
        model = BinaryData.fromObject(model).toObject(EmailTemplateUpdateParameterProperties.class);
        Assertions.assertEquals("hjqwmchqoh", model.subject());
        Assertions.assertEquals("xcpup", model.title());
        Assertions.assertEquals("i", model.description());
        Assertions.assertEquals("j", model.body());
        Assertions.assertEquals("lvw", model.parameters().get(0).name());
        Assertions.assertEquals("wsmosao", model.parameters().get(0).title());
        Assertions.assertEquals("qnamppultassa", model.parameters().get(0).description());
    }
}

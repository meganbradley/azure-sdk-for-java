// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.CustomDomainProperties;
import com.azure.resourcemanager.webpubsub.models.ResourceReference;
import org.junit.jupiter.api.Assertions;

public final class CustomDomainPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomDomainProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Failed\",\"domainName\":\"iby\",\"customCertificate\":{\"id\":\"dl\"}}")
                .toObject(CustomDomainProperties.class);
        Assertions.assertEquals("iby", model.domainName());
        Assertions.assertEquals("dl", model.customCertificate().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomDomainProperties model =
            new CustomDomainProperties()
                .withDomainName("iby")
                .withCustomCertificate(new ResourceReference().withId("dl"));
        model = BinaryData.fromObject(model).toObject(CustomDomainProperties.class);
        Assertions.assertEquals("iby", model.domainName());
        Assertions.assertEquals("dl", model.customCertificate().id());
    }
}

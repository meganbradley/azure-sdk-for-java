// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.CustomDomainInner;
import com.azure.resourcemanager.webpubsub.models.CustomDomainList;
import com.azure.resourcemanager.webpubsub.models.ResourceReference;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CustomDomainListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomDomainList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"domainName\":\"ivwitqscywugg\",\"customCertificate\":{\"id\":\"luhczbw\"}},\"id\":\"mhairsbrgzdwmsw\",\"name\":\"ypqwdxggiccc\",\"type\":\"xqhuexm\"}],\"nextLink\":\"tlstvlzywem\"}")
                .toObject(CustomDomainList.class);
        Assertions.assertEquals("ivwitqscywugg", model.value().get(0).domainName());
        Assertions.assertEquals("luhczbw", model.value().get(0).customCertificate().id());
        Assertions.assertEquals("tlstvlzywem", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomDomainList model =
            new CustomDomainList()
                .withValue(
                    Arrays
                        .asList(
                            new CustomDomainInner()
                                .withDomainName("ivwitqscywugg")
                                .withCustomCertificate(new ResourceReference().withId("luhczbw"))))
                .withNextLink("tlstvlzywem");
        model = BinaryData.fromObject(model).toObject(CustomDomainList.class);
        Assertions.assertEquals("ivwitqscywugg", model.value().get(0).domainName());
        Assertions.assertEquals("luhczbw", model.value().get(0).customCertificate().id());
        Assertions.assertEquals("tlstvlzywem", model.nextLink());
    }
}

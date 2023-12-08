// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkanalytics.models.DataProductInformation;
import com.azure.resourcemanager.networkanalytics.models.DataProductVersion;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DataProductInformationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataProductInformation model = BinaryData.fromString(
            "{\"dataProductName\":\"xibqeojnx\",\"description\":\"bzv\",\"dataProductVersions\":[{\"version\":\"ntwndeicbtwnpzao\"},{\"version\":\"vuhrhcffcyddgl\"},{\"version\":\"jthjqkwpyei\"}]}")
            .toObject(DataProductInformation.class);
        Assertions.assertEquals("xibqeojnx", model.dataProductName());
        Assertions.assertEquals("bzv", model.description());
        Assertions.assertEquals("ntwndeicbtwnpzao", model.dataProductVersions().get(0).version());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataProductInformation model
            = new DataProductInformation().withDataProductName("xibqeojnx").withDescription("bzv")
                .withDataProductVersions(Arrays.asList(new DataProductVersion().withVersion("ntwndeicbtwnpzao"),
                    new DataProductVersion().withVersion("vuhrhcffcyddgl"),
                    new DataProductVersion().withVersion("jthjqkwpyei")));
        model = BinaryData.fromObject(model).toObject(DataProductInformation.class);
        Assertions.assertEquals("xibqeojnx", model.dataProductName());
        Assertions.assertEquals("bzv", model.description());
        Assertions.assertEquals("ntwndeicbtwnpzao", model.dataProductVersions().get(0).version());
    }
}

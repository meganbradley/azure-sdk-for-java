// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.WikiCollection;

public final class WikiCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WikiCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"documents\":[{\"documentationId\":\"banf\"}]},\"id\":\"ndscxmxeatk\",\"name\":\"bmwnrdjyibqb\",\"type\":\"aomhjrmkuhmaxl\"}],\"nextLink\":\"lfihcj\"}")
                .toObject(WikiCollection.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WikiCollection model = new WikiCollection();
        model = BinaryData.fromObject(model).toObject(WikiCollection.class);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.BatchLocationQuotaInner;

public final class BatchLocationQuotaInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BatchLocationQuotaInner model
            = BinaryData.fromString("{\"accountQuota\":581868928}").toObject(BatchLocationQuotaInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BatchLocationQuotaInner model = new BatchLocationQuotaInner();
        model = BinaryData.fromObject(model).toObject(BatchLocationQuotaInner.class);
    }
}

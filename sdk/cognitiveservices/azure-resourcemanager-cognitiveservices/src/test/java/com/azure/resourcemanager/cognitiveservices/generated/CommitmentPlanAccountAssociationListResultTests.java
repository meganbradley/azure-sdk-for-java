// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlanAccountAssociationListResult;
import org.junit.jupiter.api.Assertions;

public final class CommitmentPlanAccountAssociationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommitmentPlanAccountAssociationListResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"lwfffi\",\"value\":[{\"etag\":\"qqmtedltmmji\",\"properties\":{\"accountId\":\"ozphvwauyqncygu\"},\"id\":\"kvi\",\"name\":\"mdscwxqupev\",\"type\":\"hfstotxhojujbyp\"},{\"etag\":\"c\",\"properties\":{\"accountId\":\"ixbjx\"},\"id\":\"fw\",\"name\":\"yl\",\"type\":\"coolsttpkiwkkb\"},{\"etag\":\"rywvtylbfpn\",\"properties\":{\"accountId\":\"doiwi\"},\"id\":\"thtywub\",\"name\":\"cbihwqk\",\"type\":\"fdntwjchrdgoih\"},{\"etag\":\"wct\",\"properties\":{\"accountId\":\"zj\"},\"id\":\"uu\",\"name\":\"fdlwg\",\"type\":\"ytsbwtovv\"}]}")
                .toObject(CommitmentPlanAccountAssociationListResult.class);
        Assertions.assertEquals("lwfffi", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommitmentPlanAccountAssociationListResult model =
            new CommitmentPlanAccountAssociationListResult().withNextLink("lwfffi");
        model = BinaryData.fromObject(model).toObject(CommitmentPlanAccountAssociationListResult.class);
        Assertions.assertEquals("lwfffi", model.nextLink());
    }
}

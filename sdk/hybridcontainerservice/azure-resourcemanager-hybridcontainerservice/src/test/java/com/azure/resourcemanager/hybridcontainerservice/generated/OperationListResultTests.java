// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.OperationListResult;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"bobzdopcjwvnhd\",\"isDataAction\":true,\"display\":{\"provider\":\"xcxrsl\",\"resource\":\"utwu\",\"operation\":\"grpkhjwniyqs\",\"description\":\"i\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"},{\"name\":\"zzlvmbmpaxmodfv\",\"isDataAction\":false,\"display\":{\"provider\":\"sbpfvmwyhr\",\"resource\":\"uyfta\",\"operation\":\"cpwi\",\"description\":\"vqtmnub\"},\"origin\":\"system\",\"actionType\":\"Internal\"},{\"name\":\"smond\",\"isDataAction\":true,\"display\":{\"provider\":\"vypomgkopkwho\",\"resource\":\"pajqgxysm\",\"operation\":\"mbqfqvmk\",\"description\":\"oz\"},\"origin\":\"user\",\"actionType\":\"Internal\"}],\"nextLink\":\"xprglyatddc\"}")
            .toObject(OperationListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model = new OperationListResult();
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
    }
}

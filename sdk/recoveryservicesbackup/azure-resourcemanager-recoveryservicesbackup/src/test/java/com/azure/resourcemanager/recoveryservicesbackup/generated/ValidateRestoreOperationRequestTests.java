// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateRestoreOperationRequest;

public final class ValidateRestoreOperationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ValidateRestoreOperationRequest model = BinaryData.fromString(
            "{\"objectType\":\"ValidateRestoreOperationRequest\",\"restoreRequest\":{\"objectType\":\"RestoreRequest\"}}")
            .toObject(ValidateRestoreOperationRequest.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ValidateRestoreOperationRequest model
            = new ValidateRestoreOperationRequest().withRestoreRequest(new RestoreRequest());
        model = BinaryData.fromObject(model).toObject(ValidateRestoreOperationRequest.class);
    }
}

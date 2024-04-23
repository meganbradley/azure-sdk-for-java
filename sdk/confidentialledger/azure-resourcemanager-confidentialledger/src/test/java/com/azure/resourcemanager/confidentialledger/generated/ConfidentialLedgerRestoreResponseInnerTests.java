// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confidentialledger.fluent.models.ConfidentialLedgerRestoreResponseInner;

public final class ConfidentialLedgerRestoreResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfidentialLedgerRestoreResponseInner model = BinaryData.fromString("{\"message\":\"maajrmvdjwzrlo\"}")
            .toObject(ConfidentialLedgerRestoreResponseInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfidentialLedgerRestoreResponseInner model = new ConfidentialLedgerRestoreResponseInner();
        model = BinaryData.fromObject(model).toObject(ConfidentialLedgerRestoreResponseInner.class);
    }
}

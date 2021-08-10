// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch;

import com.azure.core.util.Context;

/** Samples for BatchAccount GetKeys. */
public final class BatchAccountGetKeysSamples {
    /**
     * Sample code: BatchAccountGetKeys.
     *
     * @param batchManager Entry point to BatchManager.
     */
    public static void batchAccountGetKeys(com.azure.resourcemanager.batch.BatchManager batchManager) {
        batchManager.batchAccounts().getKeysWithResponse("default-azurebatch-japaneast", "sampleacct", Context.NONE);
    }
}

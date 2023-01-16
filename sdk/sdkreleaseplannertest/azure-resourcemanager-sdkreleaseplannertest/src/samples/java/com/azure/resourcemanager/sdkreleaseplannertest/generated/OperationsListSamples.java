// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.generated;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/sdkreleaseplannertest/resource-manager/Microsoft.DataBoxEdge/stable/2022-03-01/examples/OperationsGet.json
     */
    /**
     * Sample code: OperationsGet.
     *
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void operationsGet(com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}

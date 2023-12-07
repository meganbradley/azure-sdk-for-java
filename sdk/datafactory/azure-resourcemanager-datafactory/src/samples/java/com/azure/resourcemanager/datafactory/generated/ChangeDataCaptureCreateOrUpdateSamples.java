// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.resourcemanager.datafactory.models.ChangeDataCaptureResource;
import com.azure.resourcemanager.datafactory.models.MapperPolicy;
import com.azure.resourcemanager.datafactory.models.MapperSourceConnectionsInfo;
import com.azure.resourcemanager.datafactory.models.MapperTargetConnectionsInfo;
import java.util.List;

/**
 * Samples for ChangeDataCapture CreateOrUpdate.
 */
public final class ChangeDataCaptureCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/
     * ChangeDataCapture_Create.json
     */
    /**
     * Sample code: ChangeDataCapture_Create.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void changeDataCaptureCreate(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.changeDataCaptures().define("exampleChangeDataCapture")
            .withExistingFactory("exampleResourceGroup", "exampleFactoryName")
            .withSourceConnectionsInfo((List<MapperSourceConnectionsInfo>) null)
            .withTargetConnectionsInfo((List<MapperTargetConnectionsInfo>) null).withPolicy((MapperPolicy) null)
            .withDescription(
                "Sample demo change data capture to transfer data from delimited (csv) to Azure SQL Database with automapped and non-automapped mappings.")
            .withAllowVNetOverride(false).create();
    }

    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/
     * ChangeDataCapture_Update.json
     */
    /**
     * Sample code: ChangeDataCapture_Update.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void changeDataCaptureUpdate(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        ChangeDataCaptureResource resource = manager.changeDataCaptures().getWithResponse("exampleResourceGroup",
            "exampleFactoryName", "exampleChangeDataCapture", null, com.azure.core.util.Context.NONE).getValue();
        resource.update().withDescription(
            "Sample demo change data capture to transfer data from delimited (csv) to Azure SQL Database. Updating table mappings.")
            .withAllowVNetOverride(false).withStatus("Stopped").apply();
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.DeviceManagementClient;
import com.azure.iot.deviceupdate.DeviceManagementClientBuilder;

public class DeviceManagementImportDevices {
    public static void main(String[] args) {
        DeviceManagementClient deviceManagementClient =
                new DeviceManagementClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildClient();
        // BEGIN:com.azure.iot.deviceupdate.generated.devicemanagementimportdevices.devicemanagementimportdevices
        BinaryData importType = BinaryData.fromString("\"All\"");
        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, BinaryData> response =
                deviceManagementClient.beginImportDevices(importType, requestOptions);
        // END:com.azure.iot.deviceupdate.generated.devicemanagementimportdevices.devicemanagementimportdevices
    }
}

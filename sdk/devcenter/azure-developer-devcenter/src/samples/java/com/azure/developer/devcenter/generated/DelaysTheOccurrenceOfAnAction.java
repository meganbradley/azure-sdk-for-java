// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.developer.devcenter.DevBoxesClient;
import com.azure.developer.devcenter.DevBoxesClientBuilder;
import com.azure.developer.devcenter.models.DevBoxAction;
import com.azure.identity.DefaultAzureCredentialBuilder;
import java.time.OffsetDateTime;

public class DelaysTheOccurrenceOfAnAction {
    public static void main(String[] args) {
        DevBoxesClient devBoxesClient
            = new DevBoxesClientBuilder().credential(new DefaultAzureCredentialBuilder().build())
                .endpoint(
                    "https://8a40af38-3b4c-4672-a6a4-5e964b1870ed-contosodevcenter.centralus.devcenter.azure.com/")
                .buildClient();
        // BEGIN:com.azure.developer.devcenter.generated.delayaction.delaystheoccurrenceofanaction
        DevBoxAction response = devBoxesClient.delayAction("myProject", "me", "myDevBox", "schedule-default",
            OffsetDateTime.parse("2022-09-30T17:00:00Z"));
        // END:com.azure.developer.devcenter.generated.delayaction.delaystheoccurrenceofanaction
    }
}

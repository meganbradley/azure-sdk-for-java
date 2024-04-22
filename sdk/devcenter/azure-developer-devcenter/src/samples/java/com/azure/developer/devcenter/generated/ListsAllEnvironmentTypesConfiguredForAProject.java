// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.developer.devcenter.DeploymentEnvironmentsClient;
import com.azure.developer.devcenter.DeploymentEnvironmentsClientBuilder;
import com.azure.developer.devcenter.models.DevCenterEnvironmentType;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ListsAllEnvironmentTypesConfiguredForAProject {
    public static void main(String[] args) {
        DeploymentEnvironmentsClient deploymentEnvironmentsClient
            = new DeploymentEnvironmentsClientBuilder().credential(new DefaultAzureCredentialBuilder().build())
                .endpoint(
                    "https://8a40af38-3b4c-4672-a6a4-5e964b1870ed-contosodevcenter.centralus.devcenter.azure.com/")
                .buildClient();
        // BEGIN:com.azure.developer.devcenter.generated.listenvironmenttypes.listsallenvironmenttypesconfiguredforaproject
        PagedIterable<DevCenterEnvironmentType> response
            = deploymentEnvironmentsClient.listEnvironmentTypes("myProject");
        // END:com.azure.developer.devcenter.generated.listenvironmenttypes.listsallenvironmenttypesconfiguredforaproject
    }
}

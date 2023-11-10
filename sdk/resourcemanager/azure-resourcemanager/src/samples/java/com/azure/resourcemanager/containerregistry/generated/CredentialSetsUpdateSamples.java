// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.resourcemanager.containerregistry.models.AuthCredential;
import com.azure.resourcemanager.containerregistry.models.CredentialName;
import com.azure.resourcemanager.containerregistry.models.CredentialSetUpdateParameters;
import java.util.Arrays;

/**
 * Samples for CredentialSets Update.
 */
public final class CredentialSetsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/
     * CredentialSetUpdate.json
     */
    /**
     * Sample code: CredentialSetUpdate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void credentialSetUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries().manager().serviceClient().getCredentialSets().update("myResourceGroup",
            "myRegistry", "myCredentialSet",
            new CredentialSetUpdateParameters().withAuthCredentials(Arrays.asList(new AuthCredential()
                .withName(CredentialName.CREDENTIAL1).withUsernameSecretIdentifier("fakeTokenPlaceholder")
                .withPasswordSecretIdentifier("fakeTokenPlaceholder"))),
            com.azure.core.util.Context.NONE);
    }
}

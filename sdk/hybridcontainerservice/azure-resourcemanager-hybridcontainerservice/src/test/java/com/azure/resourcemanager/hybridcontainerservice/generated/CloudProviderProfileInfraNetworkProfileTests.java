// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfileInfraNetworkProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CloudProviderProfileInfraNetworkProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudProviderProfileInfraNetworkProfile model = BinaryData.fromString("{\"vnetSubnetIds\":[\"ithxqhabifpi\"]}")
            .toObject(CloudProviderProfileInfraNetworkProfile.class);
        Assertions.assertEquals("ithxqhabifpi", model.vnetSubnetIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudProviderProfileInfraNetworkProfile model
            = new CloudProviderProfileInfraNetworkProfile().withVnetSubnetIds(Arrays.asList("ithxqhabifpi"));
        model = BinaryData.fromObject(model).toObject(CloudProviderProfileInfraNetworkProfile.class);
        Assertions.assertEquals("ithxqhabifpi", model.vnetSubnetIds().get(0));
    }
}

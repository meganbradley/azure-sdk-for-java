// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AuthenticationDetailsProperties;

public final class AuthenticationDetailsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AuthenticationDetailsProperties model = BinaryData.fromString(
            "{\"authenticationType\":\"AuthenticationDetailsProperties\",\"authenticationProvisioningState\":\"Invalid\",\"grantedPermissions\":[\"AWS::AWSSecurityHubReadOnlyAccess\",\"AWS::SecurityAudit\"]}")
            .toObject(AuthenticationDetailsProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AuthenticationDetailsProperties model = new AuthenticationDetailsProperties();
        model = BinaryData.fromObject(model).toObject(AuthenticationDetailsProperties.class);
    }
}

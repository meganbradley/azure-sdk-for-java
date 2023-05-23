// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.JwtClaimChecks;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class JwtClaimChecksTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JwtClaimChecks model =
            BinaryData
                .fromString(
                    "{\"allowedGroups\":[\"gxsabkyq\",\"uujitcjc\"],\"allowedClientApplications\":[\"evndh\",\"rwpdappdsbdkvwrw\",\"feusnhut\",\"eltmrldhugjzzdat\"]}")
                .toObject(JwtClaimChecks.class);
        Assertions.assertEquals("gxsabkyq", model.allowedGroups().get(0));
        Assertions.assertEquals("evndh", model.allowedClientApplications().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JwtClaimChecks model =
            new JwtClaimChecks()
                .withAllowedGroups(Arrays.asList("gxsabkyq", "uujitcjc"))
                .withAllowedClientApplications(
                    Arrays.asList("evndh", "rwpdappdsbdkvwrw", "feusnhut", "eltmrldhugjzzdat"));
        model = BinaryData.fromObject(model).toObject(JwtClaimChecks.class);
        Assertions.assertEquals("gxsabkyq", model.allowedGroups().get(0));
        Assertions.assertEquals("evndh", model.allowedClientApplications().get(0));
    }
}

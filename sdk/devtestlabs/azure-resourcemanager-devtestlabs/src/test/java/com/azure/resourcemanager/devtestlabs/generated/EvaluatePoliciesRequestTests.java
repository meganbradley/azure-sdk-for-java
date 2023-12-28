// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.EvaluatePoliciesProperties;
import com.azure.resourcemanager.devtestlabs.models.EvaluatePoliciesRequest;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EvaluatePoliciesRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EvaluatePoliciesRequest model =
            BinaryData
                .fromString(
                    "{\"policies\":[{\"factName\":\"lmywwtkgkxnyed\",\"factData\":\"gyvudtjuewbc\",\"valueOffset\":\"xuuwhcj\",\"userObjectId\":\"ccybvp\"},{\"factName\":\"akkud\",\"factData\":\"xgwjplmagstcyoh\",\"valueOffset\":\"kyrk\",\"userObjectId\":\"dg\"}]}")
                .toObject(EvaluatePoliciesRequest.class);
        Assertions.assertEquals("lmywwtkgkxnyed", model.policies().get(0).factName());
        Assertions.assertEquals("gyvudtjuewbc", model.policies().get(0).factData());
        Assertions.assertEquals("xuuwhcj", model.policies().get(0).valueOffset());
        Assertions.assertEquals("ccybvp", model.policies().get(0).userObjectId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EvaluatePoliciesRequest model =
            new EvaluatePoliciesRequest()
                .withPolicies(
                    Arrays
                        .asList(
                            new EvaluatePoliciesProperties()
                                .withFactName("lmywwtkgkxnyed")
                                .withFactData("gyvudtjuewbc")
                                .withValueOffset("xuuwhcj")
                                .withUserObjectId("ccybvp"),
                            new EvaluatePoliciesProperties()
                                .withFactName("akkud")
                                .withFactData("xgwjplmagstcyoh")
                                .withValueOffset("kyrk")
                                .withUserObjectId("dg")));
        model = BinaryData.fromObject(model).toObject(EvaluatePoliciesRequest.class);
        Assertions.assertEquals("lmywwtkgkxnyed", model.policies().get(0).factName());
        Assertions.assertEquals("gyvudtjuewbc", model.policies().get(0).factData());
        Assertions.assertEquals("xuuwhcj", model.policies().get(0).valueOffset());
        Assertions.assertEquals("ccybvp", model.policies().get(0).userObjectId());
    }
}

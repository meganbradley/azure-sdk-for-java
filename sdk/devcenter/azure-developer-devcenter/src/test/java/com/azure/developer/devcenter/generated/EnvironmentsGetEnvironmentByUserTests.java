// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class EnvironmentsGetEnvironmentByUserTests extends DevCenterClientTestBase {
    @Test
    @Disabled
    public void testEnvironmentsGetEnvironmentByUserTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                deploymentEnvironmentsClient.getEnvironmentWithResponse("myProject", "me", "mydevenv", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"name\":\"mydevenv\",\"catalogName\":\"main\",\"environmentDefinitionName\":\"helloworld\",\"environmentType\":\"DevTest\",\"parameters\":{\"functionAppRuntime\":\"node\",\"storageAccountType\":\"Standard_LRS\"},\"provisioningState\":\"Succeeded\",\"resourceGroupId\":\"/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg028321\",\"user\":\"b08e39b4-2ac6-4465-a35e-48322efb0f98\"}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}

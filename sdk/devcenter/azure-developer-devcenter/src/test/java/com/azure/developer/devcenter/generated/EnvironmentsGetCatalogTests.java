// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EnvironmentsGetCatalogTests extends DevCenterClientTestBase {
    @Test
    public void testEnvironmentsGetCatalogTests() {
        RequestOptions requestOptions = new RequestOptions();

        Response<BinaryData> response =
                deploymentEnvironmentsClient.getCatalogWithResponse(projectName, catalogName, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(String.format("{\"name\":\"%s\"}", catalogName)).toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}

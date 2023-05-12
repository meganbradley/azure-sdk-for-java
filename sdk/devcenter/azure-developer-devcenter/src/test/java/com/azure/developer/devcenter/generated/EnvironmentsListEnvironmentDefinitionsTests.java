// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.TypeReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public final class EnvironmentsListEnvironmentDefinitionsTests extends DevCenterClientTestBase {
    @Test
    public void testEnvironmentsListEnvironmentDefinitionsTests() {
        RequestOptions requestOptions = new RequestOptions();

        PagedIterable<BinaryData> response =  deploymentEnvironmentsClient.listEnvironmentDefinitions(projectName, requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());

        int numberOfEnvDefinitions = 0;
        for(BinaryData data: response){
            numberOfEnvDefinitions++;
            Map<String, Object> envDefinition = data.toObject(new TypeReference<Map<String, Object>>() {});
            System.out.println(envDefinition.get("name"));
        }

        Assertions.assertEquals(3, numberOfEnvDefinitions);
    }
}
